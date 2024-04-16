import java.util.Scanner;

public class Uni4Exe23 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int entrada = teclado.nextInt();
        String resultado;

        switch (entrada) {
            case 1 :
                resultado = "Janeiro";
                break;
            case 2:
                resultado = "Fevereiro";
                break;
            case 3 :
                resultado = "Março";
                break;

            case 4 :
                resultado = "Abril";
                break;
            case 5 :
                resultado = "Maio";
                break;
            case 6 :
                resultado = "Junho";
                break;
            case 7 :
                resultado = "Julho";
                break;
            case 8 :
                resultado = "Agosto";
                break;
            case 9 :
                resultado = "Setembro";
                break;
            case 10 :
                resultado = "Outubro";
                break;
            case 11 :
                resultado = "Novembro";
                break;
            case 12 :
                resultado = "Dezembro";
                break;
            default:
                resultado = "Valor invalido";
        }

        System.out.println("Nome do mês: " + resultado);

        teclado.close();
    }
}


