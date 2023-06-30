package ListaDeExercicios0081;

import java.util.ArrayList;
import java.util.List;

public class BdProdutos {

   private List<Produto> produtos = new ArrayList<>();

   public BdProdutos(){
       iniciarBancoProdutos();
   }

   public void iniciarBancoProdutos(){
       adicionarProduto(new Produto("martelo de desempenar vidro",99.00));
       adicionarProduto(new Produto("Espelho anti-reflexo",100.0));
       adicionarProduto(new Produto("serrote banguela", 50.00));
       adicionarProduto(new Produto("água gasosa", 10.00));
       adicionarProduto(new Produto("estátua do homem invisível",2222.34));
   }

   public void adicionarProduto(Produto produto){
       produtos.add(produto);
       System.out.println("item adicionado");
   }

    public boolean produtoJaExistente(String produto){
        for (Produto nomeProduto: this.produtos) {
            if(nomeProduto.getNome().equalsIgnoreCase(produto)){
                return true;
            }
        }
        return false;
    }

    public List<Produto> listaProduto(){
        List<Produto> listaProduto = new ArrayList<>();
        for (Produto produto: this.produtos) {
            listaProduto.add(produto);
        }
        System.out.println(listaProduto);
       return listaProduto;
    }

    public void excluirProduto(Produto produto){
        produtos.remove(produto);
        System.out.println("item removido");
    }


}
