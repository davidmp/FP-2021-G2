import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class RepasoJava {
    static Scanner bjTecla1=new Scanner(System.in);
    static int a=10;
    static double e=5;
    char b='8';
    short c=1;
    float d=5;    
    long f=54;
    String g="dfsdfsdf";
    Integer j=54;
    Double h=54.2;
    Long m=(long)87;
    BigInteger n;
    BigDecimal o;


public static void saludo() {
    System.out.println("Dime tu nombre:"); 
    String nombre=objTecla1.next();
    System.out.println("Hola "+nombre);
}

public static void saludo2() {
    System.out.println("Hola Mundo"); 
 }

public static void operacionBasicas(){
    System.out.println("Suma:"+(a+e));
    System.out.println("Resta:"+(a-e));
    System.out.println("Divicion:"+(a/e));
    System.out.println("Multiplicacion:"+(a*e));
    System.out.println("Potencia:"+(Math.pow(a, e)));
}

public void operacionBasicas2(){
    System.out.println("Suma:"+(a+e));
    System.out.println("Resta:"+(a-e));
    System.out.println("Divicion:"+(a/e));
    System.out.println("Multiplicacion:"+(a*e));
    System.out.println("Potencia:"+(Math.pow(a, e)));
}
public static void main(String[] args) {
    //saludo();
    operacionBasicas();

    //RepasoJava objRJ=new RepasoJava();
    //objRJ.operacionBasicas2();

}

}

