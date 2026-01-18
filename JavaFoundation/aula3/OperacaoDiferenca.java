package aula3;

import java.util.Locale;
import java.util.Scanner; // Importar a biblioteca de entrada de dados

public class OperacaoDiferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    sc.useLocale(Locale.US);
		
		System.out.println("Início do programa...");
		System.out.println("Operação -> Subtração");
		System.out.print("Digite um número: ");
		double n1 = sc.nextDouble();  // armazena número 1
		
		System.out.print("Digite outro número: ");
		double n2 = sc.nextDouble();  // armazena número 2		
		
		double mult = n1 * n2;
		
		System.out.printf("A multiplicação de %.1f e %.1f é igual a: %.1f", n1, n2, mult);
		sc.close();

	}

}
