import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);
        
        if (letra == 'M'){
            System.out.println("Masculino");
        }
        else if ( letra == 'F'){
            System.out.println("Feminino");
        }
        else if (letra == 'I'){
            System.out.println("Não informado");
        }
        else {
            System.out.println("Estrada incorreta");
        }

        teclado.close();
        
        }
    }

