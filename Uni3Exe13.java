import java.util.Scanner;

public class Uni3Exe13 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //variaveis
        double azulejo = 12.50;
        double metroQua = 9;

        //Solicitando ao usuario que digite compprimento e largura
        System.out.println("Digite o comprimento em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura em metros: ");
        double largura = scanner.nextDouble();

        double area = largura * comprimento;

        //corresponde a trornar um numero real em inteiro
        long areaInteira = (long) Math.ceil(area);

        //quantidade de azulejos
        double quantAzule = areaInteira * metroQua;

        //valor azulejo
        double valor = quantAzule * azulejo;

        System.out.printf("O valor total dos azulejos é de R$: %.2f%n ", valor);

        scanner.close();


    }
}