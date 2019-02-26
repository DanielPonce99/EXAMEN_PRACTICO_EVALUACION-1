/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user1
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aux=0;
        int aiDatos[]; 
          aiDatos= new int[15];
          for (int i = 0; i < aiDatos.length; i++) {   
            aiDatos[i] = (int) ((Math.random() * 20) + 1);
             
          
              boolean encontrado = false;
               int iter = 0; // Iterador
 
               while ((!encontrado) && (iter < aiDatos.length)) {
                 if (aiDatos[iter] == aiDatos[i])
                  encontrado = true;
                   iter++;
  }
 
                 if (encontrado)
                   System.out.println ("[" + aiDatos[i] +"]" + " Es un número repetido. Encontrado en " + iter + " Búsquedas");
                     else
                       System.out.println ("[" +aiDatos[i] +"]" + " No está en la lista. No encontrado en " + iter + " Búsquedas");
}
        }
          
    }
    

