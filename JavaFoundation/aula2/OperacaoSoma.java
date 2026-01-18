package aula2;

import java.util.Locale;
import java.util.Scanner;

public class OperacaoSoma {

	public static void main(String[] args) {
	// Peça dois números ao usuário e efetue a soma deles e exiba o resultado
		Scanner sc = new Scanner (System.in);
		double n1,n2;
		double soma;
		
		System.out.println("Olá!");
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextDouble();
		soma = n1 + n2;
		
		System.out.printf("A soma dos números é: %.1f", soma);
		
		sc.close();

	}

}
