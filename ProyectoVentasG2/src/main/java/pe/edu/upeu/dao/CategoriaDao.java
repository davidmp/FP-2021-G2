package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

/**
 * CategoriaDao
 */
public class CategoriaDao extends AppCrud {
    LeerArchivo lar;
    CategoriaTO catTO;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();
    
    public Object[][] crearCategoria() {
        catTO=new CategoriaTO();
        System.out.println("-------------Registro de Categoria------------");
        lar=new LeerArchivo("Categoria.txt");
        catTO.setIdCateg(generarId(lar, 0, "C", 1));
        catTO.setNombre(lte.leer("", "Ingrese nombre de categoria:"));        
        return agregarContenido(lar, catTO);
    }
    
    public void reporteCategoria(Object[][] data) {
        System.out.println("-------------Reporte de Categoria------------");
        //lar=new LeerArchivo("Categoria.txt");
        //listarContenido(aq);
        imprimirLista(data);
    }
}