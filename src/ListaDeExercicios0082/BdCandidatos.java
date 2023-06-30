package ListaDeExercicios0082;

import java.util.ArrayList;
import java.util.List;

public class BdCandidatos {

   private List<Candidatos> candidatos = new ArrayList<>();

   public BdCandidatos(){
       iniciarBancoCandidatos();
   }

   public void iniciarBancoCandidatos(){
       adicionarCandidato(new Candidatos("171",99.00));
       adicionarCandidato(new Candidatos("9999",100.0));
       adicionarCandidato(new Candidatos("123456", 77.00));
       adicionarCandidato(new Candidatos("876543", 60.00));
       adicionarCandidato(new Candidatos("45635",80.34));
   }

   public void adicionarCandidato(Candidatos candidatos){
       this.candidatos.add(candidatos);
       System.out.println("candidato adicionado");
   }

    public boolean candidatoJaExistente(String candidato){
        for (Candidatos nomeCandidatos : this.candidatos) {
            if(nomeCandidatos.getMatricula().equalsIgnoreCase(candidato)){
                return true;
            }
        }
        return false;
    }

    public List<Candidatos> listaCandidatos(){
        List<Candidatos> listaCandidatos = new ArrayList<>();
        for (Candidatos candidatos : this.candidatos) {
            listaCandidatos.add(candidatos);
        }
        System.out.println(listaCandidatos);
       return listaCandidatos;
    }

    public void excluirCandidato(Candidatos candidatos){
        this.candidatos.remove(candidatos);
        System.out.println("candidato removido");
    }


}
