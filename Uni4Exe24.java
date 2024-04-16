import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String resultado = " ";
        int opcao = teclado.nextInt();
        int C = teclado.nextInt();
        int B = teclado.nextInt();
        int A = teclado.nextInt();

        switch (opcao) {
            case 1 :
                if (A <= B && B <= C){
                    resultado = A + " " + B + " " + C;
                    }
                   else if (A <= C && C <= B){
                        resultado = A + " " + C + " " + B;
                    }
                    else if (B <= A && A <= C){
                        resultado = B + " " + A + " " + C;
                    }
                    else if (B <= C && C <= A){
                        resultado = B + " " + C + " " + A;
                    }
                    else if (C <= A && A <= B){
                        resultado = C + " " + A + " " + B;
                    }
                    else if (C <= B && B <= A){
                        resultado = C + " " + B + " " + A;
                    }
    
                 break;
            case 2 :
                if (A >= B && B >= C){
                     resultado = A + " " + B + " " + C;
                    }
                    else if (A >= C && C >= B){
                     resultado = A + " " + C + " " + B;
                    }       
                     else if (B >= A && A >= C){
                    resultado = B + " " + A + " " + C;
                     }
                    else if (B >= C && C >= A){
                                resultado = B + " " + C + " " + A;
                    }
                     else if (C >= A && A >= B){
                                resultado = C + " " + A + " " + B;
                    }
                    else if (C <= B && B <= A){
                                resultado = C + " " + B + " " + A;
                    }

                     break;
       
            case 3 :
                    if (A >= B && B >= C){
                    resultado = B + " " + A + " " + C;
                     }
                    else if (A >= C && C >= B){
                     resultado = C + " " + A + " " + B;
                    }                
                    else if (B >= A && A >= C){
                    resultado = A + " " + B + " " + C;
                    }
                    else if (B >= C && C >= A){
                    resultado = C + " " + B + " " + A;
                    }
                    else if (C >= A && A >= B){
                    resultado = A + " " + C + " " + B;
                    }
                    else if (C <= B && B <= A){
                    resultado = A + " " + C + " " + A;
                    }
                 break;   

                default:
                resultado = "Valor invalido";
            }

        System.out.println("Nome do mês: " + resultado);
            
        teclado.close();
    }
}

    
            


                    
                
                 


