package models;


import java.util.Objects;

public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        try {
            this.letrasJaDigitadas = "";
        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada (char letra)
    {
        try {
            for(int i = 0; i < this.letrasJaDigitadas.length(); i++) {
                if (this.letrasJaDigitadas.charAt(i) == letra){
                    return true;
                }
            }
        }catch (Exception erro) {
            System.err.println(erro.getMessage());
        }
        return false;
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo

    }

    public void registre (char letra) throws Exception
    {
        try {
            if (this.isJaDigitada(letra))
                throw new Exception("A letra " + letra + " já foi digitada!");
        }catch (Exception erro) {
            System.err.println(erro.getMessage());
        }
        this.letrasJaDigitadas += letra;

		// verifica se a letra fornecida ja foi digitada (pode usar
		// o m�todo this.isJaDigitada, para isso), lancando uma exce��o
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    }

    public String toString ()
    {
        String RetornaletrasJaDigitadas = "";
        try {
            for(int i = 0; i < this.letrasJaDigitadas.length(); i++){
                RetornaletrasJaDigitadas += letrasJaDigitadas.charAt(i) + " , ";
            }
        }catch (Exception erro) {
            System.err.println(erro.getMessage());
        }
        return RetornaletrasJaDigitadas;
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por v�rgula (,).
    }

    public boolean equals (Object obj)
    {
        if(this == obj){
            return true;
        } else if (obj == null) {
            return false;
        }

        ControladorDeLetrasJaDigitadas letras = (ControladorDeLetrasJaDigitadas) obj;
        return letrasJaDigitadas == letras.letrasJaDigitadas;
        // verificar se this e obj s�o iguais
    }

    public int hashCode ()
    {
        return Objects.hash(letrasJaDigitadas);
        // calcular e retornar o hashcode de this
    }

    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas) throws Exception // construtor de c�pia
    {
        if(controladorDeLetrasJaDigitadas == null) {
            throw new Exception("controladorDeLetrasJaDigitadas não existe - null");
        }
        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone ()
    {
        ControladorDeLetrasJaDigitadas copia = null;
        try {
            copia = new ControladorDeLetrasJaDigitadas(this);
        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }
        return copia;
        // criar uma c�pia do this com o construtor de c�pia e retornar
    }
}
