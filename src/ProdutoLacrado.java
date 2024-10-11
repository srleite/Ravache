public class ProdutoLacrado extends Produto{

    public ProdutoLacrado() {
    }

    public ProdutoLacrado(String nome, double preco) {
        super(nome, preco);
    }



    public double calcularDesconto(double porcentagem) {
        if(preco > 500){
        porcentagem = 10;
        preco = preco*((100 - porcentagem)/100);

        }else{
        porcentagem += 5;
        preco = preco*((100.0 - porcentagem)/100.0);
        }
        return preco;
        }}

