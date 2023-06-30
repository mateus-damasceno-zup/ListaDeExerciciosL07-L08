package ListaDeExercicios007;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Franca extends Pais{
    private List<Pais> vizinhos = new ArrayList<>();


    public Franca(String codigo, double populacao, BigDecimal dimensao, List<Pais> vizinhos) {
        super(codigo, populacao, dimensao);
        this.vizinhos = vizinhos;
    }

    public List<Pais> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<Pais> vizinhos) {
        this.vizinhos = vizinhos;
    }

    public List<Pais> vizinhosEmComum(Pais pais) {
        List<Pais> vizinhosEmComum = new ArrayList<>();

        for (Pais p : vizinhos) {
            if (p.isVizinho(vizinhos)) {
                vizinhosEmComum.add(p);
            }
        }

        return vizinhosEmComum;
    }
}
