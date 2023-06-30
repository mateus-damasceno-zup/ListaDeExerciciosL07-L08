package ListaDeExercicios0081;


import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {

        ProdutoController produtoController = new ProdutoController();



        int opcao=0;
        while(opcao!=-1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("digite uma das opçoes abaixo" +
                    "\n1- adicionar produto no banco" +
                    "\n2- listar produtos" +
                    "\n3- excluir produto" +
                    "\n-1 para sair");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1) {
                System.out.println("digite o nome do produto");
                String nome = sc.nextLine();
                System.out.println("digite o valor");
                double valor = sc.nextDouble();
                Produto produto = new Produto(nome,valor);
                produtoController.cadastraProduto(produto);

            } else if (opcao == 2) {
                produtoController.listaProdutos();
            } else if (opcao == 3) {
                System.out.println("digite o nome do produto para excluir");
                String produtoAExcluir = sc.nextLine();
                produtoController.excluirProduto(produtoAExcluir);
            }
        }


    }
}
