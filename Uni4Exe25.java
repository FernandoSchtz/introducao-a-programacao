import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");

        System.out.print("Digite a opção desejada: ");
        int opcao = teclado.nextInt();

        double resultado = 0.0;

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                double num1 = teclado.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = teclado.nextDouble();
                resultado = num1 + num2;
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                double num3 = teclado.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num4 = teclado.nextDouble();
                resultado = num3 - num4;
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                double num5 = teclado.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num6 = teclado.nextDouble();
                resultado = num5 * num6;
                break;
            case 4:
                System.out.print("Digite um número maior que zero: ");
                double num7 = teclado.nextDouble();
                System.out.print("Digite um número maior que zero: ");
                double num8 = teclado.nextDouble();
                resultado = num7 - num8;
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida (1 a 4).");
        }

        System.out.println("Resultado: " + resultado);

        teclado.close();
    }
}
    
