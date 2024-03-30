import java.util.Scanner;

public class Uni3Exe09 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double valorPi = 3.14;

        // solicita o valor de raio
        System.out.println("Digite o valor de raio: ");
        double valorDeRaio = scanner.nextDouble();

        // solicita a altura
        System.out.println("Digite valor da altura: ");
        double valorAltura = scanner.nextDouble();
        
        // calcular o volume da lata de oleo
        double valorVolume = valorPi * Math.pow(valorDeRaio, 2) * valorAltura;

        System.out.printf("O volume da lata de óleo é: " + valorVolume);

        scanner.close();


    }
}
