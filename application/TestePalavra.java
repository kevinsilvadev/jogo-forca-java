package application;

import models.Palavra;

public class TestePalavra {

    public static void main(String[] args) throws Exception {

        //Testando passando nullo como parâmetro
        try
        {
            Palavra pv1 =  new Palavra(null);
            System.out.println("Teste 1 -> A palavra foi criada como null\n");
        } catch (Exception e) {
            System.out.println("Teste 1 -> Erro ao criar a palavra com o tipo null\n" +  e.getMessage());
        }

        //Testando passando uma String vazia como parâmetro
        try {
            Palavra pv2 = new Palavra("");
            System.out.println("Teste 2 -> Palavra criada com uma string vazia!");
        } catch (Exception e ) {
            System.out.println("Teste 2 -> Erro ao criar palavra com o tipo vazio\n " + e.getMessage());
        }

        //Tentando construir uma palavra
        Palavra pv9 = null;
        try {
            pv9 = new Palavra("ENCAPSULAMENTO");
            System.out.println("Teste 3 -> A palavra " + pv9 + " foi criada\n");
        } catch (Exception e) {
            System.out.println("Não foi possivel criar a palvra " + pv9 + "!");
        }

        //Testando palavras repetidas
        System.out.println("Teste 4 -> A palavra ENCAPSULAMENTO tem " + pv9.getQuantidade('A') + " letra iguais a 'A'\n");


        try
        {
            System.out.println ("A letra 'A' de ENCAPSULAMENTO fica na posicão " +
                    pv9
                            .getPosicaoDaIezimaOcorrencia(-1,'A'));
            System.err.println ("Encontramos aparicão da letra 'A' da palavra ENCAPSULAMENTO E NÃO ERA PARA ENCONTRAR");
        }
        catch (Exception erro)
        {
            System.err.println ("Teste 5 -> Erro ao tentar encontrar a da letra 'A' da palavra ENCAPSULAMENTO.\n");
        }

        try
        {
            System.out.println ("Teste 6 -> A primeira aparição da letra 'A' de ENCAPSULAMENTO fica na posicao " +
                    pv9.getPosicaoDaIezimaOcorrencia(1,'A') + "\n");
            System.out.println ("Teste 6 -> Encotramos a primeira letra 'A' na palavra ENCASPSULAMENTO\n");
        }
        catch (Exception erro)
        {
            System.err.println ("Erro ao tentar encontrar a da letra 'A' da palavra \"ENCAPSULAMENTO\"");
        }

        try
        {
            System.out.println ("Teste 7 -> A segunda aparição da letra 'A' de ENCAPSULAMENTO fica na posicao " +
                    pv9.getPosicaoDaIezimaOcorrencia(0,'A') + "\n");
            System.out.println ("\nTeste 7 -> Encotramos a segunda letra 'A' na palavra ENCASPSULAMENTO");
        }
        catch (Exception erro)
        {
            System.err.println ("Erro ao tentar encontrar a da letra 'A' da palavra \"ENCAPSULAMENTO\"");
        }

        System.out.println("\n-------- Testando equals Teste 8 ----------");
        Palavra pv5 =
                new Palavra("Setter");
        Palavra pv6 =
                new Palavra("Setter");
        Palavra pv7 =
                new Palavra("Getter");
        Palavra pv8 =
                new Palavra("Classe");

        System
                .out
                .println("Comparando o texto setter com setter, resultado -> "+ pv5.equals(pv6));
        System
                .out
                .println("Comparando o texto Getter com Classe, resultado -> "+ pv7.equals(pv8));
        System
                .out
                .println("Comparando o texto Setter com Classe, resultado -> "+  pv6.equals(pv8) + "\n");

        System.out.println("------- Testando o método getTamanho() --------");
        System.out.println ("Teste 9 -> \"ENCAPSULAMENTO\" tem "+pv9.getTamanho()+" letras\n");

        System.out.println(" --------- Testando HashCode ---------");
        System.out.println (pv5 + " Eh a palavra que estamos testando");
        System.out.println ("Eh "+(pv5.hashCode()==pv9.hashCode())+" que o hashCode de um \"Setter\" eh igual ao hashCode de outro \"ENCAPSULAMENTO\"");
        System.out.println ("Eh "+(pv7.hashCode()==pv8.hashCode())+" que o hashCode de \"Getter\" eh igual ao hashCode de \"Classe\"\n");

        System.out.println(" ----------- Testando CompareTo ----------");
        Palavra pv10 = new Palavra("ENCAPSULAMENTO");
        System.out.println ("Um \"ENCAPSULAMENTO\" comparado (com compareTo) com outro \"ENCAPSULAMENTO\" deu "+pv10.compareTo(pv10));
        System.out.println ("\"Setter\" comparado (com compareTo) com \"Getter\" deu "+pv5.compareTo(pv7));
        System.out.println ("Teste \"Setter\" comparado (com compareTo) com \"Classe\" deu "+pv5.compareTo(pv8));
    }
}
