import java.util.Scanner;

public class OcorrenciaLetra {

	public static void main(String[] args) {
		
		String frase;
		char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'X', 'Z', 'Y', 'W'};
		int[] ocorrencia = new int[alfabeto.length];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um frase:");
		frase = input.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {
			
			for(int j = 0; j < alfabeto.length; j++) {
				
				if(frase.substring(i, i+1).equalsIgnoreCase(Character.toString(alfabeto[j]))) {
					
					ocorrencia[j]++;
					
				}
				
			}
			
		}
		
		System.out.println("Resultados:");
		System.out.printf("Letra\tOcorrências%n");
		
		for(int i = 0; i < ocorrencia.length; i++) {
			
			System.out.printf("%c\t%d%n", alfabeto[i], ocorrencia[i]);
			
		}
	}

}
