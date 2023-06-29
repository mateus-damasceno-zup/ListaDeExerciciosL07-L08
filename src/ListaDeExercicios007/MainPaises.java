package ListaDeExercicios007;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainPaises {
    public static void main(String[] args) {
       List<Pais> vizinhosBrasil = new ArrayList<>();
       List<Pais> vizinhosFranca = new ArrayList<>();
       List<Pais> vizinhosInglaterra = new ArrayList<>();

       BigDecimal brasilDimensao = new BigDecimal("8515767049");
       BigDecimal francaDimensao = new BigDecimal(551600);
       BigDecimal inglaterraDimensao = new BigDecimal(130395);

       Pais inglaterra = new Inglaterra("GB-ENG",55619400,inglaterraDimensao,vizinhosInglaterra);

       Pais brasil = new Brasil("BRA",193946886, brasilDimensao,vizinhosBrasil);

       Pais franca = new Franca("FRA",62000000,francaDimensao,vizinhosFranca);

       vizinhosFranca.add(brasil);

       vizinhosBrasil.add(franca);
       vizinhosBrasil.add(inglaterra);

       vizinhosInglaterra.add(franca);

       brasil.densidadePopulacional();
       franca.densidadePopulacional();
       inglaterra.densidadePopulacional();

       ((Brasil) brasil).vizinhosEmComum(franca);



       System.out.println("densidade populacional do Brasil: "+brasil.densidadePopulacional());
       System.out.println("densidade populacional do França: "+franca.densidadePopulacional());
       System.out.println("densidade populacional da Inglaterra: "+ inglaterra.densidadePopulacional());

        System.out.println(brasil.getCodigo()+" Fronteiras com "+ ((Brasil) brasil).vizinhosEmComum(franca));


    }
}
