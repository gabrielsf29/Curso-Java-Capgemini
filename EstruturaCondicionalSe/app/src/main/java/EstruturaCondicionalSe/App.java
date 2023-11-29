package EstruturaCondicionalSe;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        float media = leitor.nextFloat ();
        
        if (media>=7) {
        System.out.print("Aprovado");
            if (media==10){
            System.out.print (" com nota maxima, parabens!");
            }
        } else {
        System.out.println ("Reprovado");
        }   
    }
}
