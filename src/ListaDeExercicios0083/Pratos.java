package ListaDeExercicios0083;

import java.util.List;

public class Pratos {

    private String nome;
    private List<String> ingredientes;

    public Pratos(String nome, List<String> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }


    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pratos{" +
                "nome='" + nome + '\'' +
                ", ingredientes=" + ingredientes +
                '}'+"\n";
    }
}
