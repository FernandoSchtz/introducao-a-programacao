import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de X");
        double x = teclado.nextDouble();
        System.out.println("Digite o valor de Y");
        double y = teclado.nextDouble();

        if (x == 0 && y == 0){
        System.out.println("Está no quadrante 0 ");
        }
        else if (x > 0 && y > 0){
            System.out.println("Está no quadrante 1");
        }
        else if (x > 0 && y < 0){
            System.out.println("Está no quadrante 2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Está no quadrante 3");
        }
        else if (x < 0 && y > 0){
            System.out.println("Está no quadrante 4");
        }
        else {
            System.out.println();
        }
        teclado.close();
        
    }
}
