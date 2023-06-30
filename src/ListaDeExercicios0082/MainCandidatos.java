package ListaDeExercicios0082;


import java.util.Scanner;

public class MainCandidatos {
    public static void main(String[] args) {

        CandidatosController candidatosController = new CandidatosController();



        int opcao=0;
        while(opcao!=-1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("digite uma das opçoes abaixo" +
                    "\n1- adicionar candidato no banco" +
                    "\n2- listar candidato" +
                    "\n3- excluir candidato" +
                    "\n-1 para sair");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1) {
                System.out.println("digite a matricula do candidato");
                String matricula = sc.nextLine();
                System.out.println("digite a nota");
                double nota = sc.nextDouble();
                Candidatos candidatos = new Candidatos(matricula,nota);
                candidatosController.cadastraCandidatos(candidatos);

            } else if (opcao == 2) {
                candidatosController.listaCandidatos();
            } else if (opcao == 3) {
                System.out.println("digite o nome do candidato para excluir");
                String candidatoAExcluir = sc.nextLine();
                candidatosController.excluirCandidato(candidatoAExcluir);
            }
        }


    }
}
