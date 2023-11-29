package ExercicioVinte;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int anoVeiculo = 0;
        int desconto = 0;
        char opcaoMenu = 's'; 
        float valorOriginal = 0.0f;
        int totalCarros = 0;
        int carrosAntigos = 0;
        int carrosNovos = 0;
        
        Scanner leitor = new Scanner (System.in);
        
        while (opcaoMenu == 's' || opcaoMenu == 'S'){
            
            System.out.println ("Por gentileza informe o ano do veículo");
            anoVeiculo = leitor.nextInt();
            
            if (anoVeiculo <= 2000){
                desconto = 12;
                carrosAntigos++;
                
            } else {
                desconto = 7;
                carrosNovos++;
            }
            
            System.out.println ("Informe o valor original do veículo");
            valorOriginal = leitor.nextFloat();
            
            System.out.println ("O valor a ser pago é de: " + (valorOriginal * (100 - desconto)/100));
            System.out.println ("O valor do desconto é de: " + (valorOriginal * desconto/100));
            
            System.out.println ("Quantidade de carros até o ano 2000 é de: " + carrosAntigos);
            System.out.println ("O total de carros é de: " + (carrosAntigos + carrosNovos));
            
            System.out.println ("Deseja continuar a calcular o desconto?");
            System.out.println ("(S) Sim / (N) Não");
            
            opcaoMenu = leitor.next().charAt(0);
        }
    }
}
