import java.util.Scanner;

public class Uni3Exe10 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // solicita o valor de Catelo 1
        System.out.println("Digite o valor do Cateto 1: ");
        double valorC1 = scanner.nextDouble();

        // solicita valor cateto 2
        System.out.println("Digite valor do CAteto 2: ");
        double valorC2 = scanner.nextDouble();
        
        // calcular da hipotenusa
        double valorHip = Math.pow(valorC1, 2) + Math.pow(valorC2, 2);

        // calcular o quadrado da hipotenusa
        double hipotenusa = Math.pow(valorHip,2);

        System.out.println("O volume da hipotenusa é: " + hipotenusa);

        scanner.close();
        
        
    }
}
