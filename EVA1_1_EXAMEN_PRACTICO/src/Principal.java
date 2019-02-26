
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Scanner O = new Scanner(System.in);
        int num[] = new int [15];
        
        System.out.println("♦♦ Llenar Arreglo ♦♦");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print((i+1)+".Digite numero: ");
            num[i] = O.nextInt();
            System.out.println("");
            
             {for (int j = 0; j <i; j++) {
                if(num[i]==num[j]){
                    i--;
                    System.out.println("INGRESE OTRO NUMERO");                    
                }}
            }
        }
        System.out.println("_____________________________");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("["+num[i]+"]");
        }
    }
    
}
