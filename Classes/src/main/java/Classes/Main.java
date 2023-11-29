
package Classes;

import java.util.Scanner;

public class Main {
  

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);
       
        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso (leitor.nextFloat());
        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura (leitor.nextFloat());
        
        objetoPessoa.getPeso();
        objetoPessoa.getAltura();
        
        System.out.println ("O IMC é: " + objetoPessoa.calcularIMC());
        
    }
    
}
