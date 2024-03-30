import java.util.Scanner;

public class Uni3Exe04 {

    public static void main(String[] args) {
        double  media;
        int peso1 = 5, peso2 = 3, peso3 = 2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nota 1 ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite nota 2 ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite nota 3 ");
        double nota3 = scanner.nextDouble();

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / (peso1 + peso2 + peso3));
        
        System.out.printf("Media Final:" + media);
      scanner.close();  

    }
    
}
