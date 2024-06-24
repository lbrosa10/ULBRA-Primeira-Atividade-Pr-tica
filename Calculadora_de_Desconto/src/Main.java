import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Informe a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        Desconto desconto = new Desconto(valorProduto, porcentagemDesconto);

        double valorDesconto = desconto.calcularDesconto();
        double valorFinal = desconto.calcularValorFinal();

        System.out.printf("Valor do desconto: "+ valorDesconto + "Reais");
        System.out.printf("Preço final do produto: " + valorFinal + "Reais");

        scanner.close();

      }
    }