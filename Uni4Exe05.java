import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("A cor é azul? (true/false): ");
        boolean resposta = scanner.nextBoolean();
         if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
         scanner.close();
    }
}