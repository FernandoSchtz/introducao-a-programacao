import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
    
        
        // declarar teclado
        Scanner scanner = new Scanner(System.in);

        double massa = scanner.nextDouble();
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = massa / (altura * altura);

        // Classificação do IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Magreza ";
        } else if ((imc >= 18.5) && (imc < 24.9)) {
            classificacao = "Saudável ";
        } else if ((imc >= 25.0) && (imc < 29.9)) {
            classificacao = "Sobrepeso ";
        } else if ((imc >= 30.0) && (imc < 34.9)) {
            classificacao = "Obesidade grau I";
        } else if ((imc >= 35.0) && (imc < 39.9)) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III (mórbida)";
        }

        System.out.printf("Seu IMC é: %.2f  ", imc);
        System.out.println();
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}