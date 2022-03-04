package com.dio.metodos.sobrecarga;

//CALCULO DA AREA DOS 3 TRES QUADRILATEROS NOTAVEIS


public class Main {
    public static void main(String[] args) {

        // Fazendo sobrecarga no metodo area da classe quadrilatero
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);

    }
}
