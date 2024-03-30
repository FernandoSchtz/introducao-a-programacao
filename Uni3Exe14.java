import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Gasta por litro
        double gasta = 12;
        double horas = 60;

        //Solicuta o tempo em minutos pro usuario
        System.out.println("Digite o tempo gasto em minutos:");
        double tempo = scanner.nextDouble();
        
        //convertendo de mintos pra horas
        double tempHoras = tempo / horas;

        //solicita pro usuario a distancia percorrida
        System.out.println("Digite a distancia percorrida em km: ");
        double distancia = scanner.nextDouble();

       //calcule a velocidade media
        double veloMedia = distancia / tempHoras;

        //contidade de combustivel gasto
        double quantCombus = distancia / gasta;

        //saida da velocidade media e combustivel gastos

    System.err.printf("A velociade média é de: %.2f%n", veloMedia);

    System.out.printf("A quantidade de combustivel gasto é de: %.2f%n", quantCombus);

    scanner.close();


    }
}
