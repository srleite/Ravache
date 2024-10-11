import java.util.List;
import java.util.ArrayList;

class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println("Produto: " + produto.getNome() + " // Preço pós desconto: R$ " + precoComDesconto);
        }
    }
}
