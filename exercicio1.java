import java.util.Scanner;

/**
 * exercicio1
 */
public class exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a nota 1"); // mensagem pro usuario pra saber oq é pra digitar

        double nota1 = 9; // 

        System.out.println("digite a nota 2");

        double nota2 = teclado.nextDouble(); // criação da variavel para guardsar aquilo que o usuario digitou

        System.out.println("digite a nota 3");

        double nota3 = teclado.nextDouble();

        System.out.println("digite a nota 4");

        double nota4 = teclado.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("media final " + media);

    }
}