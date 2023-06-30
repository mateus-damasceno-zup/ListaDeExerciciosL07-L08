package ListaDeExercicios0083;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPratos {
    public static void main(String[] args) {

        PratoController pratoController = new PratoController();



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
                System.out.println("digite o nome do prato");
                String nome = sc.nextLine();
                sc.nextLine();
                System.out.println("digite os ingredientes");
                boolean flag=true;
                List valor = new ArrayList();
                while(flag){
                    valor.add(sc.nextLine());
                    sc.nextLine();

                }

                Pratos pratos = new Pratos(nome,valor);
                pratoController.cadastraPrato(pratos);

            } else if (opcao == 2) {
                pratoController.listaPratos();
            } else if (opcao == 3) {
                System.out.println("digite o nome do produto para excluir");
                String produtoAExcluir = sc.nextLine();
                pratoController.excluirPrato(produtoAExcluir);
            }
        }


    }
}
