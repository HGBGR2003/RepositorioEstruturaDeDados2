package br.edu.ifgoiano.aluno.henrique.aulas;

public class Decimal {
    public static void main(String[] args) {
      int numeroBinario = numeroDecimal(222);
      System.out.println(numeroBinario);
    }

    public static int numeroDecimal(int numero) {

        if (numero == 0) {
            return 0;
        }

        return numeroDecimal(numero / 2);
    }

}
