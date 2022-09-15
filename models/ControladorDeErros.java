package models;

public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=3;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if (qtdMax > 0) {
            try {
                this.qtdMax = qtdMax;
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        } else {
            System.out.println("A quantidade máxima de erros não pode ser negativa");
        }
            // verifica se qtdMax fornecida n�o � positiva, lan�ando
            // uma exce��o.
            // armazena qtdMax fornecida em this.qtdMax.
    }

    public void registreUmErro () throws Exception
    {
        if (this.qtdErr == this.qtdMax){
            try {
                System.out.println("Quantidade de erros igual ao máximo permitido");
            }catch (Exception erro){
                System.err.println(erro.getMessage());
            }
        } else {
            this.qtdErr ++;
        }
        // verifica se this.qtdErr ja � igual a this.qtdMax,
        // lan�ando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        try {
            if (this.qtdErr == this.qtdMax){
                return true;
            }else {
                return false;
            }
        }catch (Exception erro){
            System.err.println(erro.getMessage());
        }
        return true;
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou ent�o false, caso contrario.
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (Object obj)
    {
        return true;
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        return 0;
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de c�pia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    public Object clone ()
    {
        // returnar uma c�pia de this
        return true;
    }
}
