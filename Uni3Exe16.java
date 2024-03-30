import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        //Solicite o valor da compra
        System.out.println("Digite o valor da compra: ");
        int valorCompra = scanner.nextInt();

        //solicite o valor pago pelo cliente
        System.out.println("Digite o valor pago pelo cliente: ");
        int valorPago = scanner.nextInt();

        //verifica se o valor pago é maior que o valor da compra
        while (valorPago < valorCompra) { 
        System.out.println("Valor insufuciente.");
        System.out.println("Digite o valor pago pelo cliente:");
        valorPago = scanner.nextInt();
            
        }

        //calcular o valor do troco
        int troco =  valorPago - valorCompra;

        // Calcula o número de notas de 100, 10 e 1 real
        int notas100 = troco / 100;
        int notas10 = (troco % 100) / 10;
        int notas1 = troco % 10;

        // Exibe o resultado
        System.out.printf("Troco mínimo: %d nota(s) de 100 reais, %d nota(s) de 10 reais e %d nota(s) de 1 real.%n", notas100, notas10, notas1);

        scanner.close();

        } 


    }

