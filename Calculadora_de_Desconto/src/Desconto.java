
class Desconto{
    private double valorProduto;
    private double porcentagemDesconto;


    public Desconto(double valorProduto, double porcentagemDesconto) {
        this.valorProduto = valorProduto;
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public double calcularDesconto() {
        return (valorProduto * porcentagemDesconto) / 100;
    }

    public double calcularValorFinal() {
        return valorProduto - calcularDesconto();
    }
}
