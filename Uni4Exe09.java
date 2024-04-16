import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0){
            System.out.println("Os valores são multiplos");
        }
        else{
            System.out.println("Os valores não são multiplos");
        }
        teclado.close();

    }
}
