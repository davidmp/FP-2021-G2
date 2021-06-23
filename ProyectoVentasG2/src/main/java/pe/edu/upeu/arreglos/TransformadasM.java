package pe.edu.upeu.arreglos;

public class TransformadasM {

    public void transformada01(int dimension, int valorInicial) {
        
    }

    public void imprimirContenidoMatrizEnteros(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }        
    }    
    
    public static void main(String[] args) {    
        TransformadasM tm=new TransformadasM();        
    }

}
