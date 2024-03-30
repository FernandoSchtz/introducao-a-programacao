import java.util.Scanner;

public class Uni3Exe05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de frangos: ");
    double quantidadeDeFrangos = scanner.nextDouble();
      //preço anel chip  
    double anelChip = 4.00;
    // preço anel alimentação
    double anelAlimentacao = 3.50 * 2;

    double gastoUnitario = anelChip + anelAlimentacao;
    double gastoTotal = gastoUnitario * quantidadeDeFrangos;

    System.out.printf("Valor total é R$ %.2f%n ", gastoTotal);

    scanner.close();
    
    }
}
