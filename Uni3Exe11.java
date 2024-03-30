import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Temperatura em graus Celcius
        System.out.println("Digite a temperatura em Graus Celcius: ");
        double tempC = scanner.nextDouble();

        //Claucula a temperatura em graus Fahrenheit
        double tempFahrenheit = (9.0/5.0) * tempC + 32;

        // Transforma celcius em fahrenheit
        System.out.printf("%.2f°C equivale a %.2f°F%n", tempC, tempFahrenheit);
       
       scanner.close();

    }
}
