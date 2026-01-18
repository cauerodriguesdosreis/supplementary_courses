package aula2;

import java.util.Scanner;

public class MenuNúmerosÍmparesPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		int pares[] = new int[10];

		do {
			System.out.println("Olá!");
			System.out.println("Escolha uma opção: ");
			System.out.println();
			System.out.println("1. Inserir 10 números e mostrar quais são pares: ");
			System.out.println("2. Inserir 10 números e mostrar quais são ímpares: ");
			System.out.println("3. Sair");
			opcao = sc.nextInt();

			int num = 0;
			switch (opcao) {
			case 1:
				
			}

		} while (opcao!=3);
		sc.close();
	}

}
