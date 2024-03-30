import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // nome funcionario
        System.out.println("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();
        
        // Horas trabalhadas mensais
        System.out.println("Digite as horas trabalhadas: ");
        double horas = scanner.nextDouble();

        //  Numero de dependentes
        System.out.println("Digite o número de dependentes: ");
        int depen = scanner.nextInt();

        double horasT = 10.00;
        double valorDep = 60.00;
        double descInss = 0.085; //8,5%
        double descImposRenda = 0.05; //5,0%

        //calcula salario bruto
        double salarioBru = (horas * horasT) + (depen * valorDep);

        //calculo desconto inss
        double semInss = salarioBru * descInss;

        //calculo desconto importo de renda
        double semImportoRenda = salarioBru * descImposRenda;

        // calculo salario liquido
        double salarioLiquido = salarioBru - semImportoRenda - semInss;

        System.out.println("Nome do funcionario: " + nome);
        System.out.printf("Salario bruto é R$: %.2f%n ", salarioBru);
        System.out.printf("Salario liqudo é R$: %.2f%n ", salarioLiquido);

        scanner.close();

    }
}
