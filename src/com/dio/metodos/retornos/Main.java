package com.dio.metodos.retornos;

import com.dio.metodos.sobrecarga.Quadrilatero;

public class Main {
    public static void main(String[] args) {

        // Fazendo uso dos retornos do metodo area da classe quadrilatero

        System.out.println("Exercicio Retornos");

        double areaQuadrado = RecriandoQuadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = RecriandoQuadrilatero.area(5,5);
        System.out.println("Area do retângulo: " + areaRetangulo);

        double areaTrapezio = RecriandoQuadrilatero.area(7,8,9);
        System.out.println("Area trapézio: " + areaTrapezio);


    }
}
