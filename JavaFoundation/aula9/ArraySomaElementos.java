package aula9;

public class ArraySomaElementos {

	public static void main(String[] args) {
		int[] vetorUm = {87, 68, 33, 100, 45, 78, 85, 91, 76, 7};
		int total = 0;
		
		// Econtra o total dos elementos do vetor
		
		for (int i = 0; i < vetorUm.length; i++) {
			total += vetorUm[i];
		}
		
		System.out.printf("Total dos elementos do array: %d\n", total);

	}

}
