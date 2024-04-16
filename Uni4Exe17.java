import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        // Enunciado da questão fala sobre renda anual, mas da valores parecidos com renda mensal.
        System.out.println("Digite sua renda anual: ");
        double renda = teclado.nextDouble();

        System.out.println("Digite a quantidade de dependentes: ");
        int quantD = teclado.nextInt();

        // Renda Mês é dividido por 12 pois recebemos 12 salarios por ano
        double rendaMes = renda / 12 - (quantD * 0.02 * (renda / 12));
        double imposto;
        

        if (rendaMes <= 2000.00){
            imposto = 0.0;
        }
        else if (rendaMes > 2000.00 && rendaMes <= 5000.00){
            imposto = rendaMes * 0.05;
        }
        else if (rendaMes > 5000.00 && rendaMes <= 10000.00){
            imposto = rendaMes * 0.10;
        }
        else {
            imposto = rendaMes * 0.15;
        }

        System.out.printf("Imposto de renda a pagar é de R$: %.2f ", imposto);

        teclado.close();

    }
}
