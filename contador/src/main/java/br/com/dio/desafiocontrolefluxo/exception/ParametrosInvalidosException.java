package br.com.dio.desafiocontrolefluxo.exception;

public class ParametrosInvalidosException extends Exception {

    public static void parametroInvalido () throws ParametrosInvalidosException {
            throw new ParametrosInvalidosException();
    }
}
