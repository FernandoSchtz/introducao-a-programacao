import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double selo = 0.45, adicional, peso, custoAd, custoTotal;
        int mult20;
        peso = teclado.nextDouble();
        double custo = selo;
        
        if (peso > 50){
        adicional = peso - 50;
        mult20 = (int) Math.ceil(adicional / 20);
        custoAd = mult20 * 0.45;
        custoTotal = custo + custoAd;
        System.out.printf("Custo selo: R$ %.2f ", custoTotal);
        }else{
            System.out.printf("Custo selo: R$ %.2f ", custo);
        }

      teclado.close();  

    }
}
