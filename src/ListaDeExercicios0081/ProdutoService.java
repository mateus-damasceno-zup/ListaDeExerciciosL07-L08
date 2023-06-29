package ListaDeExercicios0081;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    List<Produto> produtos = new ArrayList<>();

    public void adicionaProduto(Produto produto){
        produtos.add(produto);
    }
    public void excluirProduto(Produto produto){
        produtos.remove(produto);
    }
    public void buscaProduto(Produto produto){

        for(int i=0;i<produtos.size();i++) {
            if (produtos.contains(produto.getNome())) {
                System.out.println(produtos.get(i));
            } else {
                System.out.println("produto nao encontrado");
            }
        }
    }


}
