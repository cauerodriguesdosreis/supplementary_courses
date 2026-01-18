package aula2;

import java.util.Scanner;

public class Media_num_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_array;
		double media = 0;

		System.out.println("Olá!");
		System.out.print("Digite quantos números você deseja adicionar: ");
		num_array = sc.nextInt();
		double numeros[] = new double[num_array];

		for (int i = 0; i < num_array; i++) {
			
			double valor = 0;
			do {
				System.out.print("Digite o número: " + (i + 1) + ": ");
				valor = sc.nextDouble();

				if (valor > 10 || valor < 0) {
					System.out.println("Valor inválido! Digite um número entre 0 e 10.");
				}

			} while (valor > 10 || valor < 0);
			numeros[i] = valor;
		}

		double soma = 0;
		for (double numero : numeros) {
			soma += numero;

			media = soma / numeros.length;
		}
		System.out.printf("A média do aluno é: %.1f\n", media);

		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		sc.close();
	}

}
