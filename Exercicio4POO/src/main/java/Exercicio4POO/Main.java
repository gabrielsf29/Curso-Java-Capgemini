package Exercicio4POO;

public class Main {

    public static void main(String[] args) {
        Invoice inv = new Invoice ("Mousepad", 50.0f, 1, -10);
        
        System.out.println("Valor total da compra " + inv.getInvoiceAmount());

    }

}
