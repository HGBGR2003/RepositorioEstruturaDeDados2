package aluno.henrique;

public class exercicio5 {
    public static void main(String[] args) {
        int numeroNormal = quantasVezesApareceu(10);
        System.out.println(numeroNormal);
    }

    public static int quantasVezesApareceu(int numero){

        if (numero <= 10) {
            System.out.println("Número(s) " + numero +  " não tem algarimos repetidos!");
            return 0;
        }

        System.out.println("Numéro Original: " + numero);
        System.out.println("----------------------------------");

        int[] vetorNumero = new int [10];
        
        while (numero > 0) {
            int ultimoNumero = numero % 10;
            vetorNumero[ultimoNumero]++;
            numero /= 10;
        }

        System.out.println("Digitos repetidos:");
        System.out.println("-------------------------------");

        for(int i = 0; i < 10; i++){
            if (vetorNumero[i] > 1) {
                System.out.println("O Dígito " + i + " apareceu " + vetorNumero[i] + " vezes.");
            }
        }
    

        return quantasVezesApareceu(numero);
    }


}
