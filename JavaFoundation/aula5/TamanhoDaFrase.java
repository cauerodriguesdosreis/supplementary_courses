package aula5;

import java.util.Scanner;

public class TamanhoDaFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		// Entrada
		
		System.out.print("Forneça uma frase: ");
		String frase = sc.nextLine();
		
		// Processamento
		int tamanho = frase.length();
		
		// Saída
		System.out.println("Frase: " + frase + "\nQuantidase de caracteres: " + tamanho);
		
		sc.close();
		

	}

}
