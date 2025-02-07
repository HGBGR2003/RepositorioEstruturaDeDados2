package aluno.henrique;

public class exercicio2 {
    public static void main(String[] args) {
        int numeroDaSequencia = numeroFibonacci(3);
        System.out.println(numeroDaSequencia);
    }

    public static int numeroFibonacci(int posicaoDaSequencia ){

        if (posicaoDaSequencia == 1) {
            return 0;
        }else if (posicaoDaSequencia == 2) {
            return 1;
        }

        int primeiraPosicao = numeroFibonacci(posicaoDaSequencia - 1);
        int proximaPosicao = numeroFibonacci(posicaoDaSequencia - 2);
        int fibonnaci = primeiraPosicao + proximaPosicao;

        return fibonnaci;


    }
}
