package aula8;

import java.util.Arrays;

public class ArrayOrdenado {

	public static void main(String[] args) {
		// Exemplos de Arrays
		String[] nomes = {"Lucas", "Daniel", "Wesley", "Victor", "Roberto"};
		char[] vogais = {'i', 'u', 'a', 'o', 'e'};
		int [] numeros = {9, 2, 6, 7, 5, 3, 4, 8, 1, 0};
		float[] notas = {7.6f, 8.5f, 9.1f, 5.4f, 3.6f, 2.8f};
		
		// Rotina para ordenar os arrays
		Arrays.sort(nomes);
		System.out.print("Nomes: ");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print(nomes[i]);
			if (i < nomes.length - 2) {
				System.out.print(", ");
			}
			
			else if (i < nomes.length - 1) {
				System.out.print(" e ");
			}
			
			else {
				System.out.print(".");
		}
		
		}
		
	}
}
