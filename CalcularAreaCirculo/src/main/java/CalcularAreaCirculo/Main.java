package CalcularAreaCirculo;
import java.util.Scanner;        
public class Main {
    
    public static void main(String[] args) {
        double A, R;
        double n = 3.14159;
        
        Scanner leitor = new Scanner(System.in);
        
        R = leitor.nextDouble();
        A = n * R * R;
        System.out.println("A=" + A);
    }    
}

