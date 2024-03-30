import java.util.Scanner;

public class Uni3Exe15 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um número inteiro de 100 a 999: ");
        int numero = scanner.nextInt();
        
        int centena,dezena,unidade ;
        
        centena = numero /100;
        
        numero = numero %100; // o resto do numero por 100 será utulizado para a conta da dezena,e assim sucessivamente.
        
        dezena = numero/10;
        
        numero = numero % 10;
        
        unidade = numero;
        
        System.out.println("CENTENA: " + centena);
        
          System.out.println("DEZENA: " + dezena);
        
          System.out.println("UNIDADE: " + unidade);

          scanner.close();
        
        }
        
        }
