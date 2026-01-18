package aula5;

import java.util.Scanner;

public class TransformacoesNaFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Entrada
		System.out.print("Entre com uma frase: ");
		String exemplo = sc.nextLine();
		
		//Processamento e Saída
		System.out.println("A frase fornecida foi: " + exemplo);
		System.out.println("\nTodas em maiúsculas: " + exemplo.toUpperCase());
		System.out.println("\nTodas em minúsculas:" + exemplo.toLowerCase());
		
		sc.close();

	}

}
