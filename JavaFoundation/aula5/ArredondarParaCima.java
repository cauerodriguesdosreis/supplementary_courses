package aula5;

import java.util.Scanner;

public class ArredondarParaCima {

	public static void main(String[] args) {
		// Definir a lotação do ônibus
		final int LOTACAO_ONIBUS = 20; //Variável do tipo constante
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Qual é o número de turistas?");
		int NumeroTuristas = sc.nextInt();
		
		float qtdeOnibus = (float) NumeroTuristas / LOTACAO_ONIBUS;
		
		System.out.println("\nQuantidade de passageiros: " + NumeroTuristas);
		System.out.println("\nQuantidade calculada: " + qtdeOnibus);
		System.out.println("\nQuantidade de ônibus necessários: " + (int) Math.ceil(qtdeOnibus));
		System.out.println();
		sc.close();

	}

}
