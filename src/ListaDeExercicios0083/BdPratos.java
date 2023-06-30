package ListaDeExercicios0083;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BdPratos {

   private List<Pratos> pratos = new ArrayList<>();

   public BdPratos(){
       iniciarBancoDePratos();
   }

   public void iniciarBancoDePratos(){
       adicionarPrato(new Pratos("Ovo cozido", Arrays.asList ("ovo", "agua")));
       adicionarPrato(new Pratos("gelatina", Arrays.asList ("gelatina", "agua")));
       adicionarPrato(new Pratos("ovo benedict", Arrays.asList("ovo cozido","tempo")));

   }

   public void adicionarPrato(Pratos pratos){
       this.pratos.add(pratos);
       System.out.println("prato adicionado");
   }

    public boolean pratoJaExistente(String prato){
        for (Pratos pratos: this.pratos) {
            if(pratos.getNome().equalsIgnoreCase(prato)){
                return true;
            }
        }
        return false;
    }

    public List<Pratos> listaPratos(){
        List<Pratos> listaPratos = new ArrayList<>();
        for (Pratos pratos: this.pratos) {
            listaPratos.add(pratos);
        }
        System.out.println(listaPratos);
       return listaPratos;
    }

    public void excluirPrato(Pratos pratos){
        this.pratos.remove(pratos);
        System.out.println("prato removido");
    }


}
