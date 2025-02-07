package aluno.henrique;

public class exercicio1 {
    public static void main(String[] args) {
        int fatorial = fatorialDeUmNumero(5);
        System.out.println("O resultado do fatorial " + fatorial);
    }

    public static int fatorialDeUmNumero(int numero){
            if (numero == 1) {
                return 1;
            }else{
                //Erro encontrado, houve o esquecimento do método para ser calculado. 
                //Depois consertado.
                return numero * fatorialDeUmNumero(numero - 1);
            }
    }
}
