import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);

        System.out.println("Homem 1");
        int homem1 = teclado.nextInt();
        System.out.println("Homem 2");
        int homem2 = teclado.nextInt();
        System.out.println("Mulher 1");
        int mulher1 = teclado.nextInt();
        System.out.println("Mulher 2");
        int mulher2 = teclado.nextInt();

        int homemVelho = Math.max(homem1, homem2);
        int mulherVelha = Math.max(mulher1, mulher2);

        int homemNovo = Math.min(homem1, homem2);
        int mulherNova = Math.min(mulher1, mulher2);

        int soma = homemVelho + mulherNova;
        int multi = homemNovo * mulherVelha;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova : " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha: " + multi);

        teclado.close();
    }
}
