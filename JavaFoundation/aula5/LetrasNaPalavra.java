package aula5;

import java.util.Scanner;

public class LetrasNaPalavra {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Forneça uma palavra com pelo menos 4 letras: ");
		String palavra = sc.nextLine();
		
		//Processamento e saída 
		System.out.println("Palavra: " + palavra);
		System.out.println("Caractere 1: " + palavra.charAt(0));
		System.out.println("Caractere 2: " + palavra.charAt(1));
		System.out.println("Caractere 3: " + palavra.charAt(2));
		System.out.println("Caractere 4: " + palavra.charAt(3));
		
		sc.close();

	}

}
