import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro maior que 0:");
        int valor = scanner.nextInt();
        if ((valor % 2) == 0) {
            System.out.println("Valor par" + valor);
        }else{
            System.out.println("Valor é impar.");
        }
        scanner.close();

    }
}
