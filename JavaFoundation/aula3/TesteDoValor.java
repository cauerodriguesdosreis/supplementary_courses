package aula3;

import java.util.Scanner;

public class TesteDoValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Olá!");
		System.out.print("Digite um número para verificar se ele está entre a faixa de 21 à 89: ");
		num = sc.nextInt();
		
		if (num>20 && num<90) {
			System.out.println("Esse número está dentro da faixa!");
		} else {
			System.out.println("Esse número não está dentro da faixa!");
		}
		
		sc.close();

	}

}
