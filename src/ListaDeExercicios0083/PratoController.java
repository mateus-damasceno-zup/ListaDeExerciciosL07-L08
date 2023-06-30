package ListaDeExercicios0083;

public class PratoController {
    BdPratos bancoDePratos = new BdPratos();


    public void cadastraPrato(Pratos pratos){
        if(bancoDePratos.pratoJaExistente(pratos.getNome())){
            throw new IllegalArgumentException("Prato ja Existente");
        }
        bancoDePratos.adicionarPrato(pratos);
    }

    public void listaPratos(){
        bancoDePratos.listaPratos();

    }
    public void excluirPrato(String pratoAExcluir){

        for (Pratos p: bancoDePratos.listaPratos()) {
             if (p.getNome().equalsIgnoreCase(pratoAExcluir)){
                bancoDePratos.excluirPrato(p);

             }

        }

    }

}
