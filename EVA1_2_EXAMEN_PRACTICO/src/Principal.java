
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int[] arreglo = new int [15];       
        int c_pares=0;
        int c_impares=0;
        int C=0;
                  
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int)(Math.random()*100+1);
                
            int primo=0;
            for (int j = 1; j <=arreglo[i]; j++) {
                if ((arreglo[i] % j) == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                C++;
             }
            
            if(arreglo[i]% 2==0){
                c_pares++;
            }
            else{
                c_impares++;
        }            
    }    
        int[] primos = new int [C];
        int[] par = new int[c_pares];
        int[] impar = new int[c_impares];
        
        C=0;
        c_pares=0;
        c_impares=0;        
        //almacenamos los numeros pares e impares en sus arreglos correspondientes
        for (int i = 1; i < arreglo.length; i++) {
          
            int primo=0;
            for (int j = 1; j <=arreglo[i]; j++) {
                if ((arreglo[i] % j) == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                primos[C] = arreglo [i];
                C++;
             }
            
         if(arreglo[i]% 2==0){
                par[c_pares] = arreglo[i];
                c_pares++;
                
            }
            else{
                impar[c_impares] = arreglo[i];
                c_impares++;
            }
        }          

        System.out.println("Numeros Primos: ");
        for (int i = 0; i < C; i++) {
            System.out.print("["+primos[i]+"]");
        }
        System.out.println("");
        
        System.out.println("Pares: ");
        for (int i = 0; i <c_pares; i++) {
            System.out.print("["+ par[i]+ "]");
        }
        System.out.println("");
        
        System.out.println("Impares: ");
        for (int i = 0; i <c_impares; i++) {
            System.out.print("["+ impar[i]+ "]");

        }}}
        
