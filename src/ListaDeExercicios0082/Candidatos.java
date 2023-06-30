package ListaDeExercicios0082;

public class Candidatos {

    private String matricula;
    private Double nota;

    public Candidatos(String matricula, Double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }


    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Candidatos{" +
                "matricula='" + matricula + '\'' +
                ", nota=" + nota +
                '}';
    }
}
