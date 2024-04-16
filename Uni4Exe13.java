import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        

        int carta1 = teclado.nextInt();
        int carta2 = teclado.nextInt();
        int carta3 = teclado.nextInt();
        int contBoas = 0;

    if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
    contBoas++;
    }
    if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
    contBoas++;
    }
    if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
    contBoas++;
    }
    if (contBoas == 1) {
    System.out.println("TRUCO");
    } 
    else if (contBoas == 2) {
    System.out.println("SEIS"); 
    }else if (contBoas == 3) {
    System.out.println("NOVE");
        
teclado.close();
        }
    }
}
