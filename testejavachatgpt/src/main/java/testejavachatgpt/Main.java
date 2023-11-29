
package testejavachatgpt;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int numAlunos = 5;
      int numNotas = 3;
      double totalMedia = 0.0;

      // Loop para cada aluno
      for (int i = 1; i <= numAlunos; i++) {
         double media = 0.0;
         
         // Loop para cada nota
         for (int j = 1; j <= numNotas; j++) {
            System.out.print("Digite a nota " + j + " do aluno " + i + ": ");
            double nota = sc.nextDouble();
            media += nota;
         }
         
         media /= numNotas;
         totalMedia += media;
         System.out.println("A média do aluno " + i + " é " + media);
      }

      double mediaGeral = totalMedia / numAlunos;
      System.out.println("A média geral dos alunos é " + mediaGeral);
      sc.close();
   }
}
