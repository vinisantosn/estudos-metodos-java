package com.dio.metodos.criacao;

//Exercio que envolve a criação de quatro metodos
//sejam eles: soma, subtração, multiplicação e divisão
//com dois parametros.

public class Calculadora {

    public static void soma(double primeiroNumero, double segundoNumero) {
        double resultado = primeiroNumero + segundoNumero;

        System.out.println("A soma entre " + primeiroNumero + " e "
                + segundoNumero + " é igual a: " + resultado);

    }

    public static void subtrai(double primeiroNumero, double segundoNumero) {
        double resultado = primeiroNumero - segundoNumero;

        System.out.println("A subtração entre " + primeiroNumero + " e "
                + segundoNumero + " é igual a: " + resultado);

    }

    public static void multiplica(double primeiroNumero, double segundoNumero) {
        double resultado = primeiroNumero * segundoNumero;

        System.out.println("A multiplicação entre " + primeiroNumero + " e "
                + segundoNumero + " é igual a: " + resultado);

    }

    public static void divide(double primeiroNumero, double segundoNumero) {
        double resultado = primeiroNumero / segundoNumero;

        System.out.println("A divisão entre " + primeiroNumero + " e "
                + segundoNumero + " é igual a: " + resultado);

    }


}
