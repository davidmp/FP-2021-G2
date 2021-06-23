package pe.edu.upeu.arreglos;

public class EjemplosMatrices {

    public void conceptosMatrices() {
        //declarar matriz con datos predefinidos
        int[][] matriz={
            {5,	6,	6},
            {5,	6,	2},
            {5,	6,	2},
            {5,	6,	2}
            };
        //declarar una matrizX sin datos pero de 3x3
        int[][] matrizX=new int[3][5];

        matrizX=new int[4][4];
        //Colocando valores en una matrizX   en los indices 1,0 
        matrizX[1][0]=12;
        //obteniendo el valor o el elemento de los indices 1,0
        System.out.println("matrizX[1][0] su valor es:"+matrizX[1][0]);
        //obteniendo el tamanho de la matriz en filas
        System.out.println("Obtener tamanho en filas:"+matrizX.length); 
        //obteniendo el tamanho de la matriz en columnas
        System.out.println("Obtener tamanho en filas:"+matrizX[0].length);
        //declarando una matriz 
        int[][] matrizXY;
        matrizXY=new int[matrizX[0].length][matrizX.length];

    }

    public void sumarContenidoMatriz() {
        int[][] matriz={
            {5,	6,	6},
            {5,	6,	2},
            {5,	6,	2},
            {5,	6,	2}
            };        
        int sumaValores=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaValores=sumaValores+matriz[i][j];
            }
        }
        System.out.println("La suma de los valores/elementos de la matriz es:"+sumaValores);        
    }

    public void sumarContenidoMatrizConParametrosE(int[][] matriz) {
        int sumaValores=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaValores=sumaValores+matriz[i][j];
            }
        }
        System.out.println("La suma de los valores/elementos de la matriz es:"+sumaValores);              
    }    

    public static void main(String[] args) {
        EjemplosMatrices em=new EjemplosMatrices();
        int[][] matriz={
            {5,	6,	6},
            {5,	6,	2},
            {5,	6,	2},
            {5,	6,	2}
            };  
        em.sumarContenidoMatriz();
        em.sumarContenidoMatrizConParametrosE(matriz);

    }


}
