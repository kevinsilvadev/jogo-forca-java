package application;

import models.ControladorDeLetrasJaDigitadas;

public class TesteControladorDeLetrasJaDigitadas {

    public static void main(String[] args) throws Exception {
        ControladorDeLetrasJaDigitadas letras = new ControladorDeLetrasJaDigitadas();

        // TESTE 1: Teste do método "isJaDigitada = "a" " com valor 'a' true e 'b' false
        System.out.println("\nTeste 1:");
        System.out.println(letras.isJaDigitada('a'));
        System.out.println(letras.isJaDigitada('b'));

    }
}
