package application;

import models.Palavra;
import models.Tracinhos;

import java.util.concurrent.ExecutionException;

public class TesteTracinhos {

    public static void main(String[] args) throws Exception {

        try {
            Tracinhos tc1 = new Tracinhos(null);
        } catch (Exception e ) {
            System.err.println("Teste 1 -> Deu erro ao tentar construir tracinhos do tipo nullo\n");
        }

        try {
            Tracinhos tc2 = new Tracinhos(-1);
        } catch (Exception e) {
            System.err.println("Teste 2 -> O valor passado como parâmetro é negativo\n");
        }

        try {
            Tracinhos tc3 =  new Tracinhos(0);
            System.out.println("Teste 3 -> Foi possível cria tracinhos vazio: \"\"");
        } catch (Exception e ) {
            System.err.println("Teste 3 -> Não foi possivel criar tracinhos com valor vazio\n");
        }

        Palavra pv1 = new Palavra("SCALA");
        Tracinhos tc1 = null;
        try {
            tc1 = new Tracinhos(pv1.getTamanho());
            System.out.println("\nTeste 4 -> Deu certo construir tracinhos com a palavra JAVA: " + tc1);
        } catch (Exception e) {
            System.err.println("Teste 4 -> Não foi possivel construir tracinhos com a palavra " + pv1 + "\n");
        }

        Palavra pv2 = new Palavra("NODEJS");
        Tracinhos tc5 = null;
        Tracinhos tc6 = null;
        Tracinhos tc7 = null;

        try {
            tc5 = new Tracinhos(pv2.getTamanho());
            tc6 = new Tracinhos(pv2.getTamanho());
            tc7 = new Tracinhos(pv2.getTamanho());
            System.out.println("\nTeste 5 -> Deu certo construir tracinhos com a palavra NODEJS: " + tc5 + "\n");
        } catch (Exception erro) {
            System.err.println("Não foi possível construir tracinhos com a palavra NODEJS");
        }

        System.out.println("------- Teste 6 ->  Método revele com a palavra SCALA -----------");
        char letra = 'A';
        int qtd = pv1.getQuantidade(letra);
        try {
            for(int i = 0; i < qtd; i++) {
                System.out.println("Letras reveladas: ");
                int posicao = pv1.getPosicaoDaIezimaOcorrencia(i, letra);
                tc1.revele(posicao, letra);
            }
            System.out.println("\nDeu certo revelar as letras \"A\" da palavra SCALA: " + tc1);
        } catch (Exception erro) {
            System.err.println("Não foi possível revelar a letra \"A\" da palavra JAVA");
        }
        System.out.println("--------------------------------------------------------------\n");

        System.out.println("------- Teste 7 -> Método revele com a palavra NODEJS -----------");
         letra = 'E';
         qtd = pv1.getQuantidade(letra);
        try {
            for(int i = 0; i < qtd; i++) {
                System.out.println("Letras reveladas: ");
                int posicao = pv1.getPosicaoDaIezimaOcorrencia(i, letra);
                tc1.revele(posicao, letra);
            }
            System.out.println("Deu certo revelar as letras \"E\" da palavra SCALA: " + tc1);
        } catch (Exception erro) {
            System.err.println("Não foi possível revelar a letra \"E\" da palavra JAVA");
        }
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("\n -------------- Teste 8 -> método isComTracinhos ------------------ \n");
        try {
            if (tc1.isAindaComTracinhos()) {
                System.out.println("Deu certo a validação se ainda possuem tracinhos para revelar na palavra SCALA: " + tc1);
            }
        } catch (Exception erro) {
            System.err.println("A validação deu erro, não encontrou nenhum tracinho na palavra JAVA: " + tc1);
        }
        System.out.println("\n------------------------------------------------------------------------------\n");


        System.out.println("------------------- Teste 9 -> Método toString() -------------------------");
        System.out.println("A palavra que compõe os tracinhos é: " + pv2 + ". Tracinhos: " + tc6);
        System.out.println("-----------------------------------------------------------------");


        System.out.println("---------------------- Teste 10 -> Equals --------------------------------------------- ");
        System.out.println ("Eh " + tc6.equals(null) + " que \"NODEJS\" em tracinhos eh igual (pelo equals) a null");
        System.out.println ("Eh " + tc6.equals(tc5) + " que \"SCALA\" em tracinhos eh igual (pelo equals) a si mesmo");
        System.out.println ("Eh " + tc6.equals("_ _ _ _ _ _ _ ")+" que \"NODEJS\" em tracinhos eh igual (pelo equals) ao String \"_ _ _ _ _ _ _ \"");
        System.out.println ("Eh " + tc6.equals(tc7) +" que \"NODEJS\" em tracinhos eh igual (pelo equals) a \"NODEJS\" em tracinhos.");
        System.out.println ("Eh "+tc6.equals(tc1)+" que \"NODEJS\" em tracinhos eh igual (pelo equals) a \"SCALA\" em tracinhos");
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("----------------------------------------- Teste 11 -> hashCode -------------------------------");
        System.out.println ("Eh "+(tc6.hashCode()==tc7.hashCode())+" que o hashCode de um \"NODEJS\" em tracinhos eh igual ao hashCode de outro \"NODEJS\" em tracinhos");
        System.out.println ("Eh "+(tc6.hashCode()==tc1.hashCode())+" que o hashCode de \"NODEJS\" em tracinhos eh igual ao hashCode de \"SCALA\" em tracinhos");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("\n ----------------------- Teste 12 -> Clone --------------------");
        Tracinhos tcopy = (Tracinhos)tc6.clone();
        System.out.println("Tracinhos de \"NODEJS\" copiados em um novo objeto tcopy: tc6 = " + tc6 + ", tcopy = " + tcopy);
        System.out.println("------------------------------------------------------------------");
    }
}