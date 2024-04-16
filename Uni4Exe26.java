import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Escolha uma opção:");
        System.out.println("T - Calcular a área de um triângulo de base b e altura h.");
        System.out.println("Q - Calcular a área de um quadrado de lado l.");
        System.out.println("R - Calcular a área de um retângulo de base b e altura h.");
        System.out.println("C - Calcular a área de um círculo de raio r");

        System.out.print("Digite a opção desejada: ");
        char opcao = teclado.next().charAt(0);

        double area = 0.0;

        switch (opcao) {
            case 'T' :
                System.out.print("Digite o valor da base do triângulo: ");
                double num1 = teclado.nextDouble();
                System.out.print("Digite o valor da altura do triângulo: ");
                double num2 = teclado.nextDouble();
                area = (num1 * num2)/2;
                break;
            case 'Q' :
                System.out.print("Digite o valor o lado de um quadrado: ");
                double num3 = teclado.nextDouble();
                area = num3 * num3;
                break;
            case 'R':
                System.out.print("Digite o valor da base do retangulo: ");
                double num4 = teclado.nextDouble();
                System.out.print("Digite o valor da altura do retangulo: ");
                double num5 = teclado.nextDouble();
                area = num4 * num5;
                break;
            case 'C':
                System.out.print("Digite o valor do raio do circulo ");
                double num7 = teclado.nextDouble();
                area = Math.PI * num7 * num7;
                break;
            
            default:
            System.out.println("Opção inválida. Escolha uma opção válida (T, Q, R, C).");
        }

        System.out.println("A área é: " + area);

        teclado.close();
    }
}
    
