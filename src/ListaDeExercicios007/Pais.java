package ListaDeExercicios007;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

public abstract class Pais {
    private String codigo;
    private double populacao;
    private BigDecimal dimensao;

    public Pais(String codigo, double populacao, BigDecimal dimensao) {
        this.codigo = codigo;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public BigDecimal getDimensao() {
        return dimensao;
    }

    public void setDimensao(BigDecimal dimensao) {
        this.dimensao = dimensao;
    }

    public abstract List<Pais> vizinhosEmComum(Pais pais);
    public boolean isVizinho(List<Pais> vizinhos){
        int i=0;
        Pais vizinho = vizinhos.get(i);
        for (Pais umPais: vizinhos) {
           if(umPais.getCodigo().equalsIgnoreCase(vizinho.getCodigo())){
               return true;
           }
           i++;
        }
        return false;
    }

    public BigDecimal densidadePopulacional(){
        MathContext mc = new MathContext(5);
        BigDecimal populacao = new BigDecimal(String.valueOf(getPopulacao()));
        BigDecimal dimensao = new BigDecimal(String.valueOf(getDimensao()));

        return populacao.divide(dimensao,mc);
    }
    @Override
    public String toString() {
        return "Pais{" +
                "codigo='" + codigo + '\'' +
                ", populacao=" + populacao +
                ", dimensao=" + dimensao +
                '}';
    }
}
