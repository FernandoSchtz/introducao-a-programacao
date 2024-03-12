public class exercicio9 {
    public static void main(String[] args) {
        
        int a = 1;

        int b = 2;
        
        int formula1 = (a-b)*(a+b), formula2 = a*a+2*a*b+b*b, formula3 = a*a-2*a*b+b*b, formula4 = (a+b)*(a*a-a*b+b*b);
    
        System.out.println("(a+b)*(a-b)=" + formula1);
        System.out.println("a*a+2*a*b+b*b=" + formula2);
        System.out.println("a*a-2*a*b+*b=" + formula3);
        System.out.println("(a+b)*(a*a-a*b+b*b)=" + formula4);

        }
}