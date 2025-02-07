package aluno.henrique;

public class exercicio3 {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,7,5,6};
        int resultado = somaDeTodosVetores(vetor);
        System.out.println("O resultado da soma é " + resultado);
    }

    public static int somaDeTodosVetores(int[] vetorPrincipal){

        //Caso base se o vetorPrincipal não tiver nada nele, aí o próprio para.
        if (vetorPrincipal.length == 0) {
            return 0;
        }

        int soma = 0;
            
        for(int i = 0; i < vetorPrincipal.length; i++){
            soma += vetorPrincipal[i];
        }
    

        return soma;
    }
}
