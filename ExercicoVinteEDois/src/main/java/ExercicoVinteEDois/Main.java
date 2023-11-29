package ExercicoVinteEDois;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        int i = 0;
        
        Scanner leitor = new Scanner(System.in);
        
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
                System.out.println("O preço de custo e o de venda empatam");
            } else {
                if (precoCusto > precoVenda){
                    System.out.println("Houve prejuízo");
                } else {
                    System.out.println("Houve lucro");
                }
            }
            
        }
        
        System.out.println ("A media do custo é de: " + (totalCusto/i));
        System.out.println ("A media da venda é de: " + (totalVenda/i));
    }
    
}
