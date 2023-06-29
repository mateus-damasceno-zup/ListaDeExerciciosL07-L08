package ListaDeExercicios0081;

public class ProdutoController {
    BdProdutos bancoDeProdutos = new BdProdutos();


    public void cadastraProduto(Produto produto){
        if(bancoDeProdutos.produtoJaExistente(produto.getNome())){
            throw new IllegalArgumentException("Produto ja Existente");
        }
        bancoDeProdutos.adicionarProduto(produto);
    }

    public void listaProdutos(){
        bancoDeProdutos.listaProduto();

    }
    public void excluirProduto(String produtoAExcluir){

        for (Produto p: bancoDeProdutos.listaProduto()) {
             if (p.getNome().equalsIgnoreCase(produtoAExcluir)){
                bancoDeProdutos.excluirProduto(p);

             }

        }

    }

}
