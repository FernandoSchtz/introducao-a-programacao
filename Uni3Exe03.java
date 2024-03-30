import java.util.Scanner;

public class Uni3Exe03 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // estou solicitando que o usuario coloque o valor litro gasolina 
        System.out.println("Digite o preço do litro da gasolina");
        double litroGasolina = scanner.nextDouble();

        // estou solicitando que o usuario coloque o valor do pagamento
        System.out.println("Valor pagamento");
        double valorPagamento = scanner.nextDouble();

        // Calcula a quantidade de litros de gasolina 

        double litrosAbastecidos = valorPagamento / litroGasolina;

        System.out.printf("Quantodade de litros abastecidos : %.2f%n", litrosAbastecidos);

        scanner.close();
        

    }
    
}
