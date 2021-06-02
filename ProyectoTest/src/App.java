
import pe.edu.upeu.recur.SubProgramas;
import pe.edu.upeu.util.Teclado;

public class App {
    
    public static void main(String[] args) throws Exception {        
        System.out.println("*******Operaciones Basicas********");
        /*OperacionesMat objOB=new OperacionesMat();//Un objeto
        objOB.operacionesBasicas();*/
        Teclado tec=new Teclado();
        SubProgramas objSP=new SubProgramas();
        int numero=tec.leer(0, "Ingrese un numero");

        /*System.out.println("Factorial Iterativo:"+objSP.factorialBig(numero));
        System.out.println("Factorial Recursivo:"+objSP.factorialRecurvBig(numero));*/
        long ti=System.currentTimeMillis();
        System.out.println("Fibonacci iterativo:"+objSP.fibonacciBig(numero));
        long tf=System.currentTimeMillis();
        System.out.println("Tiempo ejecucion:"+(tf-ti));
        
        /*ti=System.currentTimeMillis();
        System.out.println("Fibonacci recursivo:"+objSP.fibonacciRecur(numero));
        tf=System.currentTimeMillis();
        System.out.println("Tiempo ejecucion:"+(tf-ti)/60000);*/

    }
}
