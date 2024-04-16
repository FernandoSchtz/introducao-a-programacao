import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int horaExtra;

        int horasTra = teclado.nextInt();
        double valorHoras = teclado.nextDouble();
    

        double salario = horasTra * valorHoras;

        if (horasTra > 160) {
            horaExtra = horasTra - 160;
            salario = (160 * valorHoras) + (horaExtra * (valorHoras/ 2));
        }else{
            salario = horasTra * valorHoras;
    
        }
        
        System.out.printf("Salario Final: R$ %.2f ", salario);

        teclado.close();


    }

}
