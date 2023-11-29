
package ExercicioVinteQuatro;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner (System.in);
        char desejaContinuar = 'S';
        int numero;
        
        while (desejaContinuar  == 'S' || desejaContinuar == 's' ){
             
        System.out.println("Por favor informe um numero!");
        numero = leitorScanner.nextInt();
            
            if (numero == 0){
                System.out.println("O numero eh 0");
            } else {
                if (numero > 0){
                    System.out.println("O numero eh positivo");
                }else {
                          System.out.println("O numero eh negativo");    
                }
                
            }
        
        System.out.println("Deseja continuar?");
        desejaContinuar = leitorScanner.next().charAt(0);    
            
        }        
    }
}
