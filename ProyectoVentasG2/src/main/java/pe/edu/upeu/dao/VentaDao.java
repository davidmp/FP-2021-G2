package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentaDao extends AppCrud{
    LeerArchivo lar;
    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();
    ProductoTO proTo;
    VentaTO ventTO;
    VentaDetalleTO vdTO;
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy"); 

    public void registroVentaGeneral() {
        String venta="SI";
        VentaTO vent=crearVenta();
        double preciototal=0;
        do{
            VentaDetalleTO vt= carritoVentas(vent);
            preciototal=preciototal+vt.getPrecioTotal();
            venta=lte.leer("", "Algo mas desea (SI=S/NO=N)?").toUpperCase();
        }while(venta.charAt(0)=='S');        
        vent.setPrecioTotal(preciototal);
        vent.setNetoTotal(vent.getPrecioTotal()/1.18);
        vent.setIgv(vent.getNetoTotal()*0.18);
        lar=new LeerArchivo("Venta.txt");
        ut.pintarLine('H', 20);
        
        System.out.println("Precio Neto S/.:"+        
        vent.getNetoTotal()+" | IGV S/.: "+vent.getIgv()+" | Total a pagar S/."+ 
        vent.getPrecioTotal());
        
        ut.pintarLine('H', 20);        
        editarRegistro(lar, 0, vent.getIdVenta(), vent);

    }

    public VentaTO crearVenta() {
        System.out.println("*****************Registro de Venta*********************");
        lar=new LeerArchivo("Venta.txt");
        ventTO=new VentaTO();
        ventTO.setIdVenta(generarId(lar, 0, "V", 1));
        ventTO.setDniCliente(lte.leer("", "Ingrese el DNI del cliente:"));
        ventTO.setFechaVenta(formato.format(new Date()));
        ventTO.setIgv(0.0);
        ventTO.setNetoTotal(0.0);
        ventTO.setPrecioTotal(0.0);
        lar=new LeerArchivo("Venta.txt");
        agregarContenido(lar, ventTO);
        return ventTO;
    }

    public VentaDetalleTO carritoVentas(VentaTO vTO) {
        mostrarProductos();
        vdTO=new VentaDetalleTO();
        lar=new LeerArchivo("VentaDetalle.txt");
        vdTO.setIdVentaDetalle(generarId(lar, 0, "VD", 2));
        vdTO.setIdProducto(lte.leer("", "Ingrese Id Producto:"));
        vdTO.setIdVenta(vTO.getIdVenta());
        LeerArchivo larX=new LeerArchivo("Producto.txt"); 
        Object[][] dataProd=buscarContenido(larX, 0, vdTO.getIdProducto()); 
        double porcentUt=Double.parseDouble(String.valueOf(dataProd[0][5]));
        double precioUnit=Double.parseDouble(String.valueOf(dataProd[0][4]));
        vdTO.setPorcentUtil(porcentUt);
        vdTO.setCantidad(lte.leer(0.0, "Ingrese cantidad:"));
        vdTO.setPrecioUnit(precioUnit+precioUnit*porcentUt);
        vdTO.setPrecioTotal(vdTO.getCantidad()*vdTO.getPrecioUnit());
        lar=new LeerArchivo("VentaDetalle.txt");
        agregarContenido(lar, vdTO);   
        return vdTO;
    }



    public void mostrarProductos() {
        ut.clearConsole();
        System.out.println("*******Agregar Productos a carrito de ventas******");
        lar=new LeerArchivo("Producto.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {
            if(Double.parseDouble(String.valueOf(data[i][6]))>0){
                System.out.print(data[i][0]+"="+data[i][1]+"(Precio:"+data[i][4]+ 
                ",Stock:"+data[i][6]+"); ");
            }            
        }
        System.out.println("");
    }



}
