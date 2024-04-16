import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int entrada = teclado.nextInt();
        String resultado;

        switch (entrada) {
            case 1 :
                resultado = "Bacharel em Ciência da Computação";
                break;
            case 2:
                resultado = "Licenciado em Computação";
                break;
            case 3 :
                resultado = " Bacharel em Sistemas de Informação";
                break;
            default:
                resultado = "Qualquer outro curso";
        }

        System.out.println("Após se formar seu curso será: " + resultado);

        teclado.close();
    }
}
