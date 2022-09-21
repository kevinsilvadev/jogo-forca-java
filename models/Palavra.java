package models;

import java.util.Objects;

public class Palavra implements Comparable<Palavra>
{
    private String texto;


    public Palavra (String texto) throws Exception
    {

        if(texto == null || texto.isEmpty()) {
            throw new Exception("Digite uma letra");
        }
        this.texto = texto;
        // verifica se o texto recebido � nulo ou ent�o vazio,
        // ou seja, sem nenhum caractere, lan�ando exce��o.
        // armazena o texto recebido em this.texto.
    }

    public int getQuantidade (char letra)
    {
        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < texto.length(); i++) {
            temp = texto.charAt(i);
            if (temp == letra)
                totalCharacters++;
        }
        return totalCharacters;
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {

        try {
            int qtd = this
                    .getQuantidade(letra) - i;
            for(int j = 0; j < this.texto.length(); j++) {
                if (letra == this.texto.charAt(j)) qtd--;
                    if (qtd == 0) return j;
            }
        } catch (Exception erro) {
            throw erro;
        }
        return -1;
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.

    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }


    public boolean equals (Object obj)
    {
        if(this == obj)
            return true;
        if(!(obj instanceof Palavra))
            return false;
        Palavra palavra = (Palavra) obj;
        return Objects
                .equals(texto, palavra.texto);
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        int ret = 999;
        ret = 13*ret  + new String(this.texto).hashCode();
        if(ret < 0) ret =- ret;
        return ret;
        // calcular e retornar o hashcode de this
    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}