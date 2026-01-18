package aula9;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] vetor = new int [5];
		
		
		// Primeira iteração c/ o usuário
		System.out.println("Olá!");
		System.out.println("Digite os valores do vetor: ");
		
		
		// Recebimento dos valores do vetor pelo usuário
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Elemento[" + (i+1) + "]: ");
			vetor[i] = sc.nextInt();
		}
		
		// Saída
		System.out.println("|");
		System.out.println("Vetor:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		sc.close();

	}

}
