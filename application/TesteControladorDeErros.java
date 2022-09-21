package application;

import models.ControladorDeErros;

public class TesteControladorDeErros {

    public static void main(String[] args) throws Exception {


        ControladorDeErros erro2 = new ControladorDeErros(3);
        ControladorDeErros erro3 = new ControladorDeErros(5);


        // TESTE 1: Teste do método "ControladorDeErros(int qtdMax) com quantidade Maxima(-1) negativa"
        System.out.println("\nTeste 1:");
        ControladorDeErros erro1 = new ControladorDeErros(-1);
        System.out.println(erro1);


        // TESTE 2:  Teste do método "registreUmErro()" com quantidade Maxima(3) de erros igual a quantidade de erros(3)
        System.out.println("\nTeste 2:");
        erro2.registreUmErro();
        System.out.println(erro2);
        //            Teste do método "registreUmErro()" com quantidade Maxima(5) de erros maior que quantidade de erros(3)
        erro3.registreUmErro();
        System.out.println(erro3);


        // TESTE 3:  Tesde do método "isAtingidoMaximoDeErros()" com valores para retornar true (erro2 [qtdMax=3, qtdErr=3]) e false (erro3 [qtdMax=5, qtdErr=3])
        System.out.println("\nTeste 3:");
        //           true
        erro2.isAtingidoMaximoDeErros();
        System.out.println(erro2.isAtingidoMaximoDeErros());
        //           false
        erro3.isAtingidoMaximoDeErros();
        System.out.println(erro3.isAtingidoMaximoDeErros());
        

    }
}