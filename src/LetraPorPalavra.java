import java.util.Scanner;

public class LetraPorPalavra {

	public static void main(String[] args) {
		
		String frase;
		String[] tokens;
		int[] numeroLetras;
				
		int tamanhoArray = 0; 
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		frase = input.nextLine();
		
		tokens = frase.split(" ");
		
		for(int i = 0; i < tokens.length; i++) {
			
			if(tokens[i].length() > tamanhoArray) {
				
				tamanhoArray = tokens[i].length();
				
			}
			
		}
		
		numeroLetras = new int[tamanhoArray];
		
		for(int i = 0; i < tokens.length; i++) {
			
			numeroLetras[tokens[i].length()-1]++;
			
		}
		
		System.out.println("Resultados:");
		System.out.printf("Comprimento\tOcorrências%n");
		
		for(int i = 0; i < numeroLetras.length; i++) {
			
			System.out.printf("%d\t%d%n", i+1, numeroLetras[i]);
			
		}

	}

}
