import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        int mes = teclado.nextInt();

        if (mes >= 13 && mes <= 48){
            System.out.println("O funcionario receberá 7% de reajuste.");
            }
            else if (mes >=1 && mes <=12){
                System.out.println("O funcionario receberá 5% de reajuste."); 
            }
            else{
                System.out.println("Não informado.");
            }
        teclado.close();
            
    }
}
