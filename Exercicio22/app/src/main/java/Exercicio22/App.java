
package Exercicio22;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        int i = 0;
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.nextLine();
            
            System.out.println("Digite o preço de custo do produto");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preço de venda do produto");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoCusto == precoVenda){
                System.out.println ("Houve um empate entre preço de custo"
                        + "e preço de venda");
            } else {
                if (precoCusto > precoVenda){
                    System.out.println ("Houve prejuízo");
                } else {
                    System.out.println ("Houve lucro");  
                }
            }
        }
        
        System.out.println("A media do preço de custo é de: " + (totalCusto/i));
        System.out.println("A media do preço de venda é de: " + (totalVenda/i));        
    }
}
