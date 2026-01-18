package aula9;

import java.util.Iterator;

public class ArrayCalculado {

	public static void main(String[] args) {
		final int TAMANHO_VETOR = 10;  // Criar a constante
		
		int[] novoArray = new int[TAMANHO_VETOR];
		
		// Calcula o valor de cada elemento do novoArray
		
		for (int contador = 0; contador < novoArray.length; contador++) {
			novoArray[contador] = ((2 * contador) + 3);
		}
		
		// Saída
		System.out.printf("%s%7s\n", "Índice", "Valor");
		// Gera a saída do valor de cada elemento
		
		for (int controle = 0; controle < novoArray.length; controle++) {
			System.out.printf("%3d%8d\n", (controle + 1), novoArray[controle]);
		}
		

	}

}
