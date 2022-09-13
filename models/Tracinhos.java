package models;

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
/*
    public boolean isAindaComTracinhos ()
    {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString ()
    {
        // retorna um String com TODOS os caracteres que h�
        // no vetor this.texto, intercalados com espa�os em
        // branco
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de c�pia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conte�do de t.texto para this.texto
    }

    public void setTexto(char texto[]) {
        this.texto = texto;
    }

    public Object clone ()
    {
        // retornar uma copia de this
    }*/
}
