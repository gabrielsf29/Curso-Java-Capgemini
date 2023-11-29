package EstruturaWhile;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner (System.in);
        
        int totalAlunos = 10;
        
        while(totalAlunos > 0){
            System.out.println("Informe seu nome");
            String nomeAluno = leitorScanner.nextLine();
            
            System.out.println("Informe sua idade");
            int idadeAluno = leitorScanner.nextInt();
            
            System.out.println ("O nome do aluno eh " + nomeAluno + " e sua "
                    + "idade eh " + idadeAluno);
            
            totalAlunos = totalAlunos - 1;
        }
        
    }
    
}
