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
    }

    public static boolean buscarArquivo(String caminhoOrigem, String nomeArquivo){
        File arquivo;
        arquivo = new File("C:\\\\Users\\\\henri\\\\OneDrive\\\\Documentos"); 
        //Continuo depois.

        if (arquivo != null) {
            arquivo.exists();
        }

        return false;
    }

    
}
