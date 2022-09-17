package models;

import java.io.ObjectStreamClass;
import java.util.Objects;

public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        if(qtd < 0) {
            throw new Exception("Digite uma quantidade positiva");
        }
        this.texto = new char[qtd];
        for(int i = 0; i < texto.length; i++){
            texto[i] = '_';
        }

		// verifica se qtd n�o � positiva, lan�ando uma exce��o.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).
    }



    public void revele (int posicao, char letra) throws Exception
    {
        for(int i = 0; i < texto.length; i++) {
            if(posicao < 0) {
                throw new Exception("A posição digitada está negativa");
            } else if(this.texto.length >= posicao) {
                throw new Exception("A posição é maior ou igual a que está no vetor de texto");
            }
            texto[posicao] = letra;
            System.out.println(texto);
        }

		// verifica se posicao � negativa ou ent�o igual ou maior
		// do que this.texto.length, lan�ando uma exce��o.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
    }

    public boolean isAindaComTracinhos ()
    {
        for (int i = 0; i < texto.length; i++)
            if (this.texto[i] == '_')
                return true;
        return false;
        // percorre o vetor de char this.texto e  verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString ()
    {
        String retTracinhos = null;
        for (int i = 0; i < this.texto.length; i++)
            retTracinhos = this.texto[i] + " ";
        return retTracinhos;
        // retorna um String com TODOS os caracteres que h�
        // no vetor this.texto, intercalados com espa�os em
        // branco
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if(!(obj instanceof Tracinhos))
                return false;
        Tracinhos tracinhos = (Tracinhos) obj;
            return Objects
                    .equals(texto, tracinhos.texto);
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        int ret  = 8;
        ret = 13*ret + new String(this.texto).hashCode();
        if(ret < 0) ret =- ret;
        return ret;
        // calcular e retornar o hashcode de this
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de c�pia
    {
        if (t == null)
            throw new Exception ("t não existe (tracinho)");
        this.texto = t.texto;
    }

    public void setTexto(char texto[]) {
        this.texto = texto;
    }

    public Object clone ()
    {
        Tracinhos ret = null;
        try {
            ret = new Tracinhos(this);
        } catch (Exception erro) {}
        return ret;
    }
}

