package pe.edu.upeu.app;

import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;

/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("------------Registro de Categoria de Productos---------");
        System.out.println("IDCateg:"+categ.getIdCateg()+"\tNombre:"+categ.getNombre());
    }

    public static void main( String[] args ){
        System.out.println( "Hello World!" );        
        LeerTeclado lt=new LeerTeclado();
        CategoriaTO categ=new CategoriaTO();

        categ.setIdCateg(lt.leer("", "Ingrese el Id Categoria:"));
        categ.setNombre(lt.leer("", "Ingrese nombre categoria:"));
        registrarCategoria(categ);


        ProductoTO pto=new ProductoTO();
        
                
        new MainGUI();
    }
}
