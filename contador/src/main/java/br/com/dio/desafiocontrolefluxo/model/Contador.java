package br.com.dio.desafiocontrolefluxo.model;

import br.com.dio.desafiocontrolefluxo.exception.ParametrosInvalidosException;

public class Contador {

    public static void contar ( int parametro1, int parametro2 ) throws ParametrosInvalidosException {

        if ( parametro1 > parametro2 ){

        ParametrosInvalidosException.parametroInvalido();

        } else {

            int contagem = parametro1 - parametro2;
            contagem = contagem * -1;
            System.out.println("Resultado do calculo é: " + contagem + " A contagem desse valor é: ");

            for (int i = 1; i <= contagem; i++){
                System.out.println(i);
            }

        }
    }
}
