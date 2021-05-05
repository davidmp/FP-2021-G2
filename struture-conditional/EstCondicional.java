import java.util.Scanner;
class EstCondicional{
static Scanner teclado=new Scanner(System.in);

static void ejercicio01(){
  //Definir variables y otros
  System.out.println("Ejemplo estructura Condicional en Java");
  int cantidadX=0;
  double montoP=0;
  //Datos de Entrada
  System.out.println("Ingrese la cantidad de lapices:");
  cantidadX=teclado.nextInt();
  //Proceso
  if(cantidadX>=1000){
  montoP=cantidadX*0.80;
  }else{
  montoP=cantidadX*0.90;
  }
  //Datos de salida
  System.out.println("El monto a pagar es :"+montoP);
}

static void postulanteCarreraEstMultiple(){
  //Definir Variables y otros
  char areaCarrera;
  String areaCarreraNcomp="";
  double notaEP=0, notaRM=0, notaRV=0, notaAB=0, notaFinal=0;
  //Datos de Entrada
  System.out.println("Ingrese el area a la que pertenece su carrera\nB=Biomedicas\nI=Ingenieria\nS=Sociales: ");
  areaCarrera=teclado.next().charAt(0);
  System.out.println("Ingrese la nota de EP:");
  notaEP=teclado.nextDouble();
  System.out.println("Ingrese la nota de RM:");
  notaRM=teclado.nextDouble();
  System.out.println("Ingrese la nota de RV:");
  notaRV=teclado.nextDouble();
  System.out.println("Ingrese la nota de AB:");
  notaAB=teclado.nextDouble();      
  //Proceso
  switch(areaCarrera){
    case 'B':{
      notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.20)+(notaAB*0.30);
      areaCarreraNcomp="Biomedicas";
     } break;
    case 'I':{
      notaFinal=(notaEP*0.40)+(notaRM*0.30)+(notaRV*0.15)+(notaAB*0.15);
      areaCarreraNcomp="Ingenierias";      
     } break;
    case 'S':{
      notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.30)+(notaAB*0.20);
      areaCarreraNcomp="Sociales";      
     } break;
    default : System.out.println("La opcion que ingreso no existe! intente nuevamente....");break;
  }
  //Datos de salida
  System.out.println("La persona obtuvo una nota de: "+notaFinal+" y su carrera es del area : "+areaCarreraNcomp);
}


public static void main(String[] arg){
 // ejercicio01();
 postulanteCarreraEstMultiple();
}
}