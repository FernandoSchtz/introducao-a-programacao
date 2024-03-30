import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita o valor em dolares
        System.out.println("Digite o valor em dolares: ");
        double valorEmDolares = scanner.nextDouble();

        // solicita a caotação do dolar (em reais)
        System.out.println("Cotação do dolar em rais: ");
        double valorCambio = scanner.nextDouble();

        // calcular o valor em reais
        double valorEmReais = valorEmDolares * valorCambio;

        System.out.printf("Valor em reais a ser devolvido é de R$ %.2f%n", valorEmReais);

        scanner.close();
    

    }
}
