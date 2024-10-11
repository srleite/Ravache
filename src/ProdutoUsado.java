public class ProdutoUsado extends Produto{

    public ProdutoUsado() {
    }

    public ProdutoUsado(String nome, double preco) {
        super(nome, preco);
    }



    public double calcularDesconto(double porcentagem) {
       porcentagem += 5;
            preco = preco*((100.0 - porcentagem)/100.0);

        return preco;
    }}

