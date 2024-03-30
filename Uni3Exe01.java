import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a Largura ");
        
        double Largura = teclado.nextDouble();

        System.out.println("Digite o Comprimento ");

        double Comprimento = teclado.nextDouble();

        double area = (Largura* Comprimento);

        System.out.println("Area Calculada " + area);

        teclado.close();


    }
}
