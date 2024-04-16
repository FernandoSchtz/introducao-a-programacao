import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int ano1 = teclado.nextInt();
    int ano2 = teclado.nextInt();
    int ano3 = teclado.nextInt();

    if (ano1 == ano2 && ano2 == ano3){
        System.out.println("Os irmãos são trigemeos");
    }else if ( ano1 == ano2 || ano1 == ano3 || ano2 == ano3){
        System.out.println("Dois dos irmãos são gemeos");
    }else{
        System.out.println("Apenas irmãos");
    }
    teclado.close();
    }
}
