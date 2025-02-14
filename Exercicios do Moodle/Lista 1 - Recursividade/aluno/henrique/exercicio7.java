package aluno.henrique;

import java.io.File;

public class exercicio7 {
    public static void main(String[] args) {
        File folder = new File("."); 
	File[] listOfFiles = folder.listFiles(); 

        
        for(File file: listOfFiles){
            System.out.println("Absolute path: " + file.getAbsolutePath()); 
	    System.out.println("Name: " + file.getName()); 
	    System.out.println("Is directory: " + file.isDirectory());
	    System.out.println("Is file: " + file.isFile()); 
	    System.out.println("");
        }

        //Professor, pra ficar melhor pode comentar a parte de cima, para ficar melhor a mensagem.

        boolean pesquisa = buscarArquivo("C:\\Users\\henri\\OneDrive\\Documentos", "maximos.pdf");
        System.out.println(pesquisa);
    }

    public static boolean buscarArquivo(String caminhoOrigem, String nomeArquivo){
        File arquivo;
        arquivo = new File(caminhoOrigem);

        File[] lista = arquivo.listFiles();

        if (!arquivo.exists()) {
            return false;
        }

        if (arquivo.isDirectory()) {
            if (lista != null) {
                for(File novoArquivo: lista){
                    if (novoArquivo.isFile() && novoArquivo.getName().equals(nomeArquivo)) {
                        System.out.println("Arquivo encontrado: " + novoArquivo);
                        return true;
                    }

                    if (novoArquivo.isDirectory()) {
                        if (buscarArquivo(novoArquivo.getAbsolutePath(), nomeArquivo)) {
                            return true;
                        }
                    }

                }
            }
        }

        return false;
    }
	
}
