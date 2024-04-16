import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double numero = scanner.nextDouble();
        
        if (numero % 1 != 0 ){
            System.out.println("O númemro possui casas decimais. ");
        }else{
            System.out.println("O nuúmero não possui casas decimais");
        }
        scanner.close();

    }
}
