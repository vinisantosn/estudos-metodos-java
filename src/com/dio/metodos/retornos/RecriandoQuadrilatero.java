package com.dio.metodos.retornos;

public class RecriandoQuadrilatero {
    public static double area(double lado) {
        double resultado = lado * lado;
        return resultado;
    }

    public static double area(double lado1, double lado2) {
        double resultado = lado1 * lado2;
        return resultado;
    }

    public static double area(double baseMenor, double baseMaior, double altura) {
        double resultado = ((baseMaior + baseMenor) * altura) / 2;
        return resultado;
    }
}
