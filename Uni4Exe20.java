import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a nota 1");
        double nota1 = teclado. nextDouble();
        System.out.println("digite a nota 2");
        double nota2 = teclado. nextDouble();
        System.out.println("digite a nota 3");
        double nota3 = teclado. nextDouble();
        System.out.println("digite a média dos exercícios");
        double mediaExe = teclado. nextDouble();

        double media = (nota1 + (nota2*2) + (nota3*3) + mediaExe)/7;
        
        if (media >= 9.0){
            System.out.printf("A, Aprovado: %.2f ", media);
        }
        else if (media >= 7.5 && media < 9.0){
            System.out.printf("B, Aprovado: %.2f ", media);
        }
        else if (media >= 6.0 && media < 7.5){
            System.out.printf("C, Aprovado: %.2f ", media);
        }
        else if (media >= 4.0 && media < 6.0){
            System.out.printf("D, Reprovado: %.2f ", media);
        }
        else{
            System.out.printf("E, Reprovado: %.2f ", media);
        }
        teclado.close();

        }

    }

