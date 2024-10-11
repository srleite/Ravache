public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produtoL = new ProdutoLacrado("Sky Team", 270.00);
        Produto produtoL1 = new ProdutoLacrado("Warhammer", 700.00);
        Produto produtoU = new ProdutoUsado("Taco Gato", 50.00);
        Produto produtoU1 = new ProdutoUsado("Zombicide", 800.00);

        estoque.adicionarProduto(produtoL);
        estoque.adicionarProduto(produtoL1);
        estoque.adicionarProduto(produtoU);
        estoque.adicionarProduto(produtoU1);

        double porcentagem = 10.0;
        estoque.exibirPrecosComDesconto(porcentagem);
    }
}
