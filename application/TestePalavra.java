package application;

import models.Palavra;

public class TestePalavra {

    public static void main(String[] args) throws Exception {

        //Testando passando nullo como parâmetro
       // Palavra pv1 =  new Palavra(null);

        //Testando passando um valor fazio como parâmetro
        //Palavra pv2 = new Palavra("");

        //Testando passando uma palavra e contando letras repetidas
        //Palavra pv3 = new Palavra("Getter");
        //pv3.getQuantidade('e');

        Palavra pv4 = new Palavra("Setter");
        pv4.getPosicaoDaIezimaOcorrencia(0,'S');
    }
}
