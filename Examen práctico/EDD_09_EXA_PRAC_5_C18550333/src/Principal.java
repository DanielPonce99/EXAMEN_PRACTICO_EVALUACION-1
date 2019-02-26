
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Littl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumCol = 0;
        int sumFilas = 0;
        int contFilas = 0;
        int contCol = 0;
        Scanner sCaptu = new Scanner(System.in);
        
        int matriz[][] = new int[4][4];
        
        System.out.println("Ingrese valores del 0 al 9");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = sCaptu.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    
        for(int i=0; i<4; i++){
            sumFilas = 0;
            for(int j=0; j<4; j++){
                sumFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila["+i+"] es: " +sumFilas);
        contFilas = i;
        }
        System.out.println("");
        
        for(int j=0; j<4; j++){
            sumCol = 0;
            for(int i=0; i<4; i++){
                sumCol += matriz[i][j];
            }
            System.out.print("\nLa suma de la columna["+j+"] es: " +sumCol);
            contCol = j;
        }
        
        System.out.println("");
       
        if(sumFilas == sumCol){
        System.out.println("\nLa suma de la fila " + contFilas + " es: " + sumFilas + " y la suma de la columna " + contCol + " es: " + sumCol + " por lo que coinciden");
    }
    }
}
