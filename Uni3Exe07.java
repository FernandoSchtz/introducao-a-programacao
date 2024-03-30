import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double lata = 0.350;
        double garrafa600 = 0.600;
        double garafa2L = 2.0;
        double quantidadeLitros;
        int quantidadeLatas, quantidade600ml, quantidadeGarrafa2L;
        String litros = (" Litros");

        System.out.printf("Lata de 350 ml: ");
        quantidadeLatas = scanner.nextInt();
        
        System.out.printf("Garrafa 600 ml: ");
         quantidade600ml = scanner.nextInt();

        System.out.printf("Garrafa 2 litros: ");
        quantidadeGarrafa2L = scanner.nextInt();

        quantidadeLitros = (lata*quantidadeLatas) + (garrafa600*quantidade600ml) + (garafa2L*quantidadeGarrafa2L);


        System.out.printf("Valor final em litros: " + quantidadeLitros + litros);

        scanner.close();



    }
}
