import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

         System.out.print("Digite o dia do vencimento: ");
        int diaVencimento = teclado.nextInt();

        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = teclado.nextInt();

        System.out.print("Digite o valor da prestação: R$ ");
        double valorPrestacao = teclado.nextDouble();

        int diasAtraso = diaPagamento - diaVencimento;
        double valorAPagar;

        if (diasAtraso <= 0) {
            valorAPagar = valorPrestacao * 0.9;
            System.out.println("Pagamento em dia. Valor a pagar: R$ " + valorAPagar);
        } else if (diasAtraso <= 5) {
            valorAPagar = valorPrestacao;
            System.out.println("Pagamento com atraso. Valor a pagar: R$ " + valorAPagar);
        } else {
            double multa = valorPrestacao * 0.02 * diasAtraso;
            valorAPagar = valorPrestacao + multa;
            System.out.println("Pagamento com atraso superior a cinco dias. Valor a pagar: R$ " + valorAPagar);
        }

        teclado.close();
    }
}

