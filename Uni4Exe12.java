import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lado1 = teclado.nextDouble();
        double lado2 = teclado.nextDouble();
        double lado3 = teclado.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Triângulo equilátero");
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo isósceles");
            }
            else {
                System.out.println("Triângulo escaleno");
            }
        }
        teclado.close();
    }
}
