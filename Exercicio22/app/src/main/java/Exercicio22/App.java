
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
            
            System.out.println("Digite o pre�o de custo do produto");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o pre�o de venda do produto");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoCusto == precoVenda){
                System.out.println ("Houve um empate entre pre�o de custo"
                        + "e pre�o de venda");
            } else {
                if (precoCusto > precoVenda){
                    System.out.println ("Houve preju�zo");
                } else {
                    System.out.println ("Houve lucro");  
                }
            }
        }
        
        System.out.println("A media do pre�o de custo � de: " + (totalCusto/i));
        System.out.println("A media do pre�o de venda � de: " + (totalVenda/i));        
    }
}
