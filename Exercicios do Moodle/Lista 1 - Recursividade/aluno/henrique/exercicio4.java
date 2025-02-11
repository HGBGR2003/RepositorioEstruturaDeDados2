package aluno.henrique;

public class exercicio4 {
    public static void main(String[] args) {
        int numero = numeroInvertido(4321);
        System.out.println(numero);
    }

    public static int numeroInvertido(int numeroNormalParaInvertido){

        if (numeroNormalParaInvertido < 10) {
            return numeroNormalParaInvertido;
        }

        int ultimoNumero = numeroNormalParaInvertido % 10;
        int restante = numeroNormalParaInvertido / 10;

        int quantidadeDeDigitos = 0;

        int auxiliar = restante;

        while (auxiliar > 0) {
            auxiliar = auxiliar / 10;
            quantidadeDeDigitos++;
        }

        int parcial = (int) (ultimoNumero * Math.pow(10, quantidadeDeDigitos));
        
        return parcial + numeroInvertido(restante);
    }
    
}
