import java.util.Scanner;

public class OcorrenciaPalavra {

	public static void main(String[] args) {
		
		String frase;
		String[] tokens;
		String[] tokensAuxiliar;
		
		int[] ocorrencias;
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		frase = input.nextLine();
		
		tokens = frase.split(" ");
		tokensAuxiliar = frase.split(" ");
		ocorrencias = new int [tokens.length];
		
		for(int i = 0; i < tokensAuxiliar.length; i++) {
			
			for(int j = i + 1; j < tokensAuxiliar.length; j++) {
				
				if(tokensAuxiliar[i].equalsIgnoreCase(tokensAuxiliar[j])) {
					
					tokensAuxiliar[j] = "";
					
				}
				
			}
			
		}
		
		for(int i = 0; i < tokensAuxiliar.length; i++) {
			
			for(int j = 0; j < tokens.length; j++) {
				
				if(tokens[j].equalsIgnoreCase(tokensAuxiliar[i])) {
					
					ocorrencias[i]++;
					
				}
				
			}
			
		}
		
		System.out.println("Resultados:");
		System.out.printf("%nPalavra\t\tOcorrência%n");
		
		for(int i = 0; i < tokensAuxiliar.length; i++) {
			
			if(!tokensAuxiliar[i].equals("")) {
				
				System.out.printf("%s\t\t%d%n", tokensAuxiliar[i].toLowerCase(), ocorrencias[i]);
				
			}
			
		}

	}

}
