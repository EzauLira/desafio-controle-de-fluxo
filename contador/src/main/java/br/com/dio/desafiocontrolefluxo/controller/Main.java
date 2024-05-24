package br.com.dio.desafiocontrolefluxo.controller;

import br.com.dio.desafiocontrolefluxo.config.TempoResposta;
import br.com.dio.desafiocontrolefluxo.exception.ParametrosInvalidosException;
import br.com.dio.desafiocontrolefluxo.model.Contador;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Olá! bem-vindo ao sistema de subtração de valores!" + "\nCOMO FUNCIONA? "
                + "\nSimples, basta colocar um valor como primeiro parâmetro e um valor como segundo parâmetro."
                + "\no sistema vai pegar o valor do segundo parâmetro e fazer a subtração do primeiro parâmetro, assim tendo o resultado final."
                + "\nÉ importante saber que é necessário que o segundo valor seja maior que o primeiro para que funcione. Por isso, o sistema subtrai o primeiro valor do segundo.");

        System.out.println("\nDigite o primeiro parâmetro: ");
        int parametro1 = input.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = input.nextInt();

        System.out.println("Aguarde o resultado da subtração dos valores...");

        TempoResposta.tempo();

        System.out.println(".");
        TempoResposta.tempo();

        System.out.println(".");
        TempoResposta.tempo();

        System.out.println(".");
        TempoResposta.tempo();

       try {
           Contador.contar(parametro1, parametro2);

       }catch (ParametrosInvalidosException exception){

           System.out.println("Parâmetro inválido! o primeiro parâmetro precisa ser menor que o segundo parâmetro.");
       }

    }
}
