package aula5;

import java.util.Scanner;

public class FraseSemEspaço {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Entrada 
		System.out.print("Manda uma frase aí: ");
		String entrada = sc.nextLine();
		
		entrada = "          " + entrada + "             ";
		
		//Procesamento e Saída
		System.out.println("Com espaços: " + "-" + entrada + "-");
		System.out.println("Sem espaços: " + "-" + entrada.trim() + "-");

		sc.close();
	}

}
