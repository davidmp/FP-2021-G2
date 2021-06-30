package pe.edu.upeu.app;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("------------Registro de Categoria de Productos---------");
        System.out.println("IDCateg:"+categ.getIdCateg()+"\tNombre:"+categ.getNombre());
    }

    public static void menuMain(){
        String mensaje="Seleccion el algoritmo que desea Ejecutar:"+
        "\n1=Registrar Categoria"+
        "\n12=Reportar Categoria "+
        "\n2=Registrar Productos"+
        "\n21=Reportar Producto"+
        "\n22=Modificar Producto"+
        "\n3=Realizar Venta"+
        "\n0=Salir del programa";
        LeerTeclado lt=new LeerTeclado(); 
        UtilsX ut=new UtilsX();
        CategoriaDao daoC;       
        int opcion=0;
        opcion=lt.leer(0, mensaje);
        do{            
            switch(opcion){
                case 1:                
                daoC=new CategoriaDao(); daoC.crearCategoria(); 
                ut.clearConsole(); break;
                case 12: 
                ut.clearConsole();
                daoC=new CategoriaDao(); daoC.reporteCategoria(); break;    
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                default: System.out.println("La opcion que eligio no exuiste!");
                break;
            }
            if(opcion!=0){
                System.out.println("\nDesea seguir probando: ");
                opcion=lt.leer(0, mensaje);
            }
            
        }while(opcion!=0);        
    }

    public static void main( String[] args ){
        menuMain();       
        //new MainGUI();
    }
}
