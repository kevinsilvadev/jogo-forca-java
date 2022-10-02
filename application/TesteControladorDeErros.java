package application;

import models.ControladorDeErros;

import java.io.PrintStream;

public class TesteControladorDeErros {

    public static void main(String[] args) throws Exception {


        ControladorDeErros erro2 = new ControladorDeErros(3);
        ControladorDeErros erro3 = new ControladorDeErros(5);


        // TESTE 1: Teste do método "ControladorDeErros(int qtdMax) com quantidade Maxima(-1) negativa"
        System.out.println("\nTeste 1:");

        try {
            ControladorDeErros erro1 = new ControladorDeErros(-1);
            System.out.println("Foi possivel instanciar o controladorDeErros com o parametro \"qtdMax\" negativo.");
        } catch (Exception e) {
            System.out.println("Foi possivel inst   anciar o controladorDeErros com o parametro \"qtdMax\" negativo.");
        }

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


        System.out.println("\nTeste 4: ");
        try {
            ControladorDeErros ctrlDeErros = new ControladorDeErros(0);
            System.out.println("Foi possivel instanciar o controladorDeErros com o parametro \"qtdMax\" = 0.");
        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros com o parametro \"qtdMax\" = 0.");
        }



        System.out.println("\n Teste 5: ");
        ControladorDeErros ctrlDeErros1 = null;
        try {
            ctrlDeErros1 = new ControladorDeErros(3);
            System.out.println("Foi possivel instanciar o controladorDeErros1 com o parametro \"qtdMax\" > 0: " + ctrlDeErros1);

        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros1 com o parametro \"qtdMax\" > 0.");
        }

        //teste 4
        System.out.println("\nTeste 6: ");
        ControladorDeErros ctrlDeErros2 = null;
        try {
            ctrlDeErros2 = new ControladorDeErros(3);
            System.out.println("Foi possivel instanciar o controladorDeErros2 com o parametro \"qtdMax\" > 0: " + ctrlDeErros2);

        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros2 com o parametro \"qtdMax\" > 0.");
        }

        System.out.println("\nTeste 7: ");
        ControladorDeErros ctrlDeErros3 = null;
        try {
            ctrlDeErros3 = new ControladorDeErros(2);
            System.out.println("Foi possivel instanciar o controladorDeErros3 com o parametro \"qtdMax\" > 0: " + ctrlDeErros3);

        } catch (Exception erro) {
            System.err.println("Não foi possivel instanciar o controladorDeErros3 com o parametro \"qtdMax\" > 0.");
        }



        System.out.println("\nTeste 8: ");
        try {
            ctrlDeErros3.registreUmErro();
            System.out.println("Foi possível adicionar um erro no \"ctrlDeErros3\"" + ctrlDeErros3);
        } catch (Exception erro) {
            System.err.println("Não foi possível adicionar um erro no \"ctrlDeErros3\"");
        }

        System.out.println("\nTeste 9: ");
        try {
            if (ctrlDeErros2.isAtingidoMaximoDeErros()) {
                System.out.println("O ctrlDeErros2 atingiu o máximo de erros");
            } else {
                System.out.println("Ainda existem possibilidades de errar no ctrlDeErros2!");
            }

        } catch (Exception erro) {
            System.err.println("Não foi possível testar se ja foi atingido o maximo de erro");
        }


        System.out.println("\nTeste 10: ");
        try {
            if (ctrlDeErros3.isAtingidoMaximoDeErros()) {
                System.out.println("O ctrlDeErros3 atingiu o máximo de erros");
            } else {
                System.out.println("Ainda existem possibilidades de errar no ctrlDeErros3!");
            }

        } catch (Exception erro) {
            System.err.println("Não foi possível testar se ja foi atingido o maximo de erro");
        }

        System.out.println("\nTeste 11: ");
        System.out.println("--->Testando com \"ctrlDeErros2\", que possui ainda possibilidades de erros: " + ctrlDeErros2);
        try {
            if (ctrlDeErros2.isAtingidoMaximoDeErros()) {
                System.out.println("O ctrlDeErros2 atingiu o máximo de erros");
            } else {
                System.out.println("Ainda existem possibilidades de errar no ctrlDeErros2!");
            }
        } catch (Exception erro) {
            System.err.println("Não foi possível testar se ja foi atingido o maximo de erro");
        }

        System.out.println("\nTeste 12: ");
        System.out.println("---> Voltando a testar com o \"ctrlDeErros3\"");
        try {
            ctrlDeErros3.registreUmErro();
            System.out.println("Foi possível adicionar um erro no \"ctrlDeErros3\"" + ctrlDeErros3);
        } catch (Exception erro) {
            System.err.println("Não foi possível testar adicionar um erro no \"ctrlDeErros3\", pois já está no limite máximo de erros.");
        }


        System.out.println("\nTeste 13: ");
        System.out.println ("ctrlDeErros1: " + ctrlDeErros1 + " eh o controlador de erros que estamos testando");
        System.out.println ("ctrlDeErros2: " + ctrlDeErros2 + " eh o controlador de erros que estamos testando");
        System.out.println ("ctrlDeErros3: " + ctrlDeErros3 + " eh o controlador de erros que estamos testando");
        System.out.println ("Eh " + ctrlDeErros1.equals(null) + " que \"ctrlDeErros1\" eh igual (pelo equals) a null");
        System.out.println ("Eh "+ctrlDeErros1.equals(ctrlDeErros1)+" que \"ctrlDeErros1\" eh igual (pelo equals) a si mesmo");
        System.out.println ("Eh "+ctrlDeErros1.equals(ctrlDeErros2)+" que \"ctrlDeErros1\": " + ctrlDeErros1 + " eh igual (pelo equals) a \"ctrlDeErros2\": " + ctrlDeErros2);
        System.out.println ("Eh "+ctrlDeErros1.equals(ctrlDeErros3)+" que \"ctrlDeErros1\": " + ctrlDeErros1 + " eh igual (pelo equals) a \"ctrlDeErros3\": " + ctrlDeErros3);

        System.out.println("\n Teste 14: ");
        System.out.println ("Eh "+(ctrlDeErros1.hashCode()==ctrlDeErros2.hashCode())+" que o hashCode de um \"ctrlDeErros1\": " + ctrlDeErros1 + " eh igual ao hashCode de outro \"ctrlDeErros2\": " + ctrlDeErros2);
        System.out.println ("Eh "+(ctrlDeErros1.hashCode()==ctrlDeErros3.hashCode())+" que o hashCode de \"ctrlDeErros1\": " + ctrlDeErros1 + " eh igual ao hashCode de \"ctrlDeErros3\": " + ctrlDeErros3);

        System.out.println("\n Teste 15: ");
        ControladorDeErros ctrlDeErrosCopy = (ControladorDeErros)ctrlDeErros1.clone();
        System.out.println("Controlador de erros \"ctrlDeErros1\" copiados em um novo objeto ctrlDeErrosCopy: ctrlDeErros1 = " + ctrlDeErros1 + ", ctrlDeErrosCopy = " + ctrlDeErrosCopy);

    }
}