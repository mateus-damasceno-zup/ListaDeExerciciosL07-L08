package ListaDeExercicios0082;

public class CandidatosController {
    BdCandidatos bancoDeCandidatos = new BdCandidatos();


    public void cadastraCandidatos(Candidatos candidatos){
        if(bancoDeCandidatos.candidatoJaExistente(candidatos.getMatricula())){
            throw new IllegalArgumentException("candidato ja Existente");
        }
        bancoDeCandidatos.adicionarCandidato(candidatos);
    }

    public void listaCandidatos(){
        bancoDeCandidatos.listaCandidatos();

    }
    public void excluirCandidato(String candidatoAExcluir){

        for (Candidatos p: bancoDeCandidatos.listaCandidatos()) {
             if (p.getMatricula().equalsIgnoreCase(candidatoAExcluir)){
                bancoDeCandidatos.excluirCandidato(p);

             }

        }

    }

}
