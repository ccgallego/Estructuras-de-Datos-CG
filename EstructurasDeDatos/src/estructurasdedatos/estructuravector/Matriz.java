
package estructurasdedatos.estructuravector;

/**
 *
 * @author Cristian C. Gallego
 */
public class Matriz {

    //VARIABLES
    private int columnas;
    private int filas;
    private int matriz[][];
    
// CREA LA MATRIZ
    public void crear(int fila, int columna) {
        this.filas = fila;
        this.columnas = columna;
        matriz = new int[fila][columna];

    }
// INSERTA ELEMENTOS A LA MATRIZ
    public void insertar(int f, int c, int num) {
        if (f > filas && c > columnas) {
            System.out.println("POSICION NO VALIDA");
        } else {
            this.filas = f;
            this.columnas = c;
            this.matriz[f][c] = num;
        }
    }

    // IMPRIME LA MATRIZ
    public void listar() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    //BORRA UN ELEMENTO DE LA MATRIZ
    public void borrar(int fila, int columna) {
        if (fila < filas && columna < columnas) {
            this.filas = fila;
            this.columnas = columna;
            this.matriz[fila][columna] = 0;
        } else {
            System.out.println("POSICION NO VALIDA");
        }
    }

    // BUSCA UN DATO E IMPRIME LA POSICION
    public void buscar(int dato) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (this.matriz[i][j] == dato) {
                    System.out.println("DATO EN LA POSICION " + i + "," + j);
                }
            }
        }
    }

    // TRANSPONE LA MATRIZ QUE SE LE PASA
    public void transpuesta() {
        int[][] matrizT = new int[matriz[0].length][matriz.length];
        System.out.println("LA TRANSPUESTA ES: ");
        for (int i = 0; i < matrizT[0].length; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                matrizT[j][i] = matriz[i][j];
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println(" ");
        }
    }

    // ACTUALIZA EL DATO EN LA FILA Y COLUMNA QUE SE LE PASE
    public void actualizar(int fil, int col, int dato) {
        if (fil > filas || col > columnas) {
            System.out.println("POSICION NO VALIDA ");
        } else {

            this.matriz[fil][col] = dato;
        }
    }
// MULTIPLICA DOS MATRICES 
     public void multiplicar(Matriz matriz2){
        int fil_m1=matriz.length;
        int col_m1=matriz.length;
        int fil_m2=matriz2.matriz.length;
        int col_m2=matriz2.matriz[0].length;
        
        if(col_m1 != fil_m2){
            System.out.println("NO SE PUEDEN MULTIPLICAR LAS MATRICES");
            
            
        }else{
            int producto[][] = new int[fil_m1][col_m2];
            for(int i=0; i < fil_m1 ; i++){
                for(int j=0; j < col_m2 ; j++){
                    int sum = 0;
                    for(int k=0; k < col_m1 ; k++){
                        sum += matriz[i][k]*matriz2.matriz[k][j];
                        producto[i][j]=sum;
                        
                    }
                    System.out.print(producto[i][j] + "\t");
                    
                }
                System.out.println(" ");
            }
        } 
        
        
    }
  /* public void multiplicacion(Matriz mat){
                int matC[][] =new int[matriz.length][mat.columnas];
                for(int i=0;i<matriz.length;i++){
                        for(int j=0;j<mat.columnas;j++){
                                int sum=0;
                                for(int k=0;k<matriz.length;k++){
                                        sum+=matriz[i][k]*mat.matriz[k][j];
                                        matC[i][j]=sum;
                                }
                                
                                System.out.print(matC[i][j] + "\t");
                        }
                        System.out.println(" ");
          }
                
        }*/

   
    
    }
