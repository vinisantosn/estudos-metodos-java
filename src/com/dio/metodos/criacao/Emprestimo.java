package com.dio.metodos.criacao;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 1.3;
    }

    public static double getTaxaTresParcelas() {
        return 1.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {
            double valorFinal = valor * getTaxaDuasParcelas();

            System.out.println("O valor final do empréstimo para duas parcelas é de: R$  " +
                    valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor * getTaxaTresParcelas();
            System.out.println("O valor final do empréstimo para três parcelas é de: R$  " +
                    valorFinal);

        } else {
            System.out.println("Quantidade de parcelas não aceita pelo sistema.");
        }

    }

}
