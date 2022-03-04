package com.dio.metodos.sobrecarga;

public class Quadrilatero {
    public static void area(double lado) {
        double resultado = lado * lado;
        System.out.println("Área do quadrado: " + resultado);
    }

    public static void area(double lado1, double lado2) {
        double resultado = lado1 * lado2;
        System.out.println("Área do retângulo: " + resultado);
    }

    public static void area(double baseMenor, double baseMaior, double altura) {
        double resultado = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Área do trapézio: " + resultado);
    }

    //Caso extra, em que a quantidade de parametros é igual a um já existente.
    //Para tanto, devemos mudar os tipos de dados passados como parametro.
    public static void area(float diagonal1, float diagonal2) {
        double resultado = (diagonal1 * diagonal2) / 2;
        System.out.println("Área do losango: " + resultado);
    }
}
