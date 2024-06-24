import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

    // Solicitando o valor venal do imóvel
    String valorVenalStr = JOptionPane.showInputDialog(null, "Informe o valor venal do imóvel:");
    double valorVenal = Double.parseDouble(valorVenalStr);

    // Solicitando a alíquota do ITBI
    String aliquotaStr = JOptionPane.showInputDialog(null, "Informe a alíquota do ITBI (em %):");
    double aliquota = Double.parseDouble(aliquotaStr);

    // Calculando o valor do ITBI
    double valorITBI = calcularITBI(valorVenal, aliquota);

    // Exibindo o resultado
    String mensagem = String.format("Valor do ITBI: R$ %.2f", valorITBI);
        JOptionPane.showMessageDialog(null, mensagem);
    }

    // Método para calcular o ITBI
    public static double calcularITBI(double valorVenal, double aliquota) {
    return (valorVenal * aliquota) / 100;
  }
}