package aula5;

import java.util.Scanner;

public class EscrevaSuaFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada
		System.out.print("Insira uma frase: ");
		String frase = sc.nextLine().trim();

		// Processamento e Saída
		System.out.println("A frase inserida foi: " + frase);
		System.out.println("(0, 8): " + frase.substring(0, 9));
		System.out.println("(10, 13): " + frase.substring(10, 14));

		sc.close();

	}

}
