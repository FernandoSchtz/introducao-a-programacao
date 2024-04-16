import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        if (numero1 > numero2){
            System.out.println("O numero maior é " + numero1);
        }else{
            System.out.println("O número maior é: " + numero2);
        }

        scanner.close();
        
    }
}
