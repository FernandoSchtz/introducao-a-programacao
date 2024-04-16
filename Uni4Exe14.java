import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o dia");
        int dia = teclado.nextInt();
        System.out.println("Escreva o mes");
        int mes = teclado.nextInt();
        System.out.println("Escreva o ano");
        int ano = teclado.nextInt();
        
        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        boolean dataValida =  (mes >= 1 && mes <= 12) &&
                              (dia >= 1 && dia <= 31 &&
                             ((mes == 4 || mes == 6 || mes == 9 || mes == 11) ? dia <= 30 :
                              (mes == 2 ? (anoBissexto ? dia <= 29 : dia <= 28) : true)));
                    if (dataValida) {
                        System.out.println("A data é válida.");
                    } else {
                        System.out.println("A data não é válida.");
                    }
    teclado.close();
    
    }
}

