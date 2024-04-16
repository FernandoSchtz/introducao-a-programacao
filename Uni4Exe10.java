import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int marquinhos, zezinho, luluzinha;

        System.out.println("Idade de Marquinhos");
        marquinhos = teclado.nextInt();
        System.out.println("Idade de Zezinho");
        zezinho = teclado.nextInt();
        System.out.println("Idade de Luluzinha");
        luluzinha = teclado.nextInt();

        int caçula = Math.min(Math.min(marquinhos, zezinho), luluzinha);    
        
        if (caçula == marquinhos){
            System.out.println("Marquinhos é o caçula");
        }
        else if (caçula == zezinho){
            System.out.println("Zezinho é o caçula");
        }
        else{
            System.out.println("Luluzinha é a caçula");
        }

        teclado.close();

    }
}
