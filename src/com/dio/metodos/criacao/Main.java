package com.dio.metodos.criacao;

public class Main {
    public static void main(String[] args) {
        // CHAMADA DOS METODOS

        // CLASSE CALCULADORA
        System.out.println("Exercício calculadora");
        Calculadora.soma(7.9, 2.5);
        Calculadora.subtrai(9, 1.8);
        Calculadora.multiplica(7, 8);
        Calculadora.divide(5, 2.5);

        //CLASSE MENSAGEM

        System.out.println("Exercio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //CLASSE EMPRÉSTIMO
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(2000, 3);
        Emprestimo.calcular(2000, 5);

    }
}
