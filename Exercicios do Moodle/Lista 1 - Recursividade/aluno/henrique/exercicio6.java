package aluno.henrique;

public class exercicio6 {
    public static void main(String[] args) {
        int numeroBinario = numeroDecimal(222);
        System.out.println(numeroBinario);
    }
    
    public static int numeroDecimal(int numero) {
    
        if (numero == 0) {
            return 0;
        }

        if (numero == 1) {
            return 1;
        }

        int valorDecimal = numeroDecimal(numero % 2) + 10 * numeroDecimal(numero / 2);

        return valorDecimal;
    
    }
    
}
