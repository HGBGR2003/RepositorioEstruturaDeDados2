package br.edu.ifgoiano.aluno.henrique.aulas;

public class Anagrama {
    public static void main(String[] args) {
        String substantivo = "gato";
        resolverAnagrama(substantivo.toCharArray(), 4);

    }

    public static void rotacionarAnagrama(char[] palavra, int novoTamanho) {
        int i;
        int posicao = palavra.length - novoTamanho;
        char temp = palavra[posicao];
        for (i = posicao + 1; i < palavra.length; i++) {
            palavra[i - 1] = palavra[i];
        }
        palavra[i - 1] = temp;
    }

    public static void resolverAnagrama(char [] palavra, int novoTamanho) {
        if (novoTamanho == 1){
            return;
        }
        for (int i = 0; i < novoTamanho; i++){
            resolverAnagrama(palavra, novoTamanho - 1);
            if (novoTamanho == palavra.length - 1) {
                System.out.println( new String(palavra));
            }
            rotacionarAnagrama(palavra, novoTamanho);
        }
    }



}
