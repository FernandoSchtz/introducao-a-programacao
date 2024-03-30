import java.util.Scanner;

public class Uni3Exe02 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

         // estou solicitando que o usuario coloque o preço do sapato
        System.out.println("Digite o preço do par de sapatos ");
        double precoSapato = scanner.nextDouble();

        // calcular o valor do desconto
        double desconto = precoSapato * 0.12;

        // calcula o preço do sapato com desconto
        double precoComDesconto = precoSapato - desconto;

        // exibir resultados
        System.out.printf("O valor do desconto é R$ %.2f%n", desconto);
        System.out.printf("O preço do par de sapatos com desconto é R$ %.2f%n", precoComDesconto);

        scanner.close();
    }
}




