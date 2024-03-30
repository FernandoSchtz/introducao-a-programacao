import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double valorQuilo = 25.00;
        double pesoPratoVazio = 0.750;

        System.out.println("Digite o peso do prato: ");
        double pesoPrato = scanner.nextDouble();

        while (pesoPrato < pesoPratoVazio) {
        System.out.println("Peso do prato insuficiente");
        System.out.println("Digite o peso do prato: ");
        pesoPrato = scanner.nextDouble();
            
        }

        double precoPrato = valorQuilo * (pesoPrato - pesoPratoVazio);

        System.out.printf("Valor da refeição é R$ %.2f%n ", precoPrato);

        scanner.close();


    }
}
