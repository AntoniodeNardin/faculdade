import java.util.Scanner;

public class Salario {

    private String nome;
    private double salarioBruto;
    private double imposto;
    private double salarioLiquido;

    // Método para calcular o salário líquido
    public void calcularSalarioLiquido() {
        salarioLiquido = salarioBruto - imposto;
    }

    // Método para aplicar aumento percentual baseado no salário bruto
    public void aplicarAumento(double percentualAumento) {
        double aumento = salarioBruto * (percentualAumento / 100);
        salarioBruto += aumento;
        calcularSalarioLiquido(); // Recalcula o salário líquido após o aumento no bruto
    }

    // Método para exibir o resultado final
    public void mostrarResultado() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto após Aumento: R$" + salarioBruto);
        System.out.println("Imposto: R$" + imposto);
        System.out.println("Salário Líquido após Imposto: R$" + salarioLiquido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salario funcionario = new Salario();

        // Coleta dos dados
        System.out.print("Digite o nome do funcionário: ");
        funcionario.nome = scanner.nextLine();
        
        System.out.print("Digite o salário bruto: ");
        funcionario.salarioBruto = scanner.nextDouble();
        
        System.out.print("Digite o valor do imposto: ");
        funcionario.imposto = scanner.nextDouble();

        funcionario.calcularSalarioLiquido();

        // Solicita e aplica o aumento
        System.out.print("Digite a porcentagem de aumento sobre o salário bruto: ");
        double percentualAumento = scanner.nextDouble();
        funcionario.aplicarAumento(percentualAumento);

        // Exibe o resultado final
        funcionario.mostrarResultado();

        scanner.close();
    }
}
