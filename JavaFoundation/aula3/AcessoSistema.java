package aula3;

import java.util.Scanner;

public class AcessoSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senhaCorreta = 27082006;
		
		System.out.println("Olá!");
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();

		if (senha == senhaCorreta) {
			System.out.println("Acesso concedido!");
		} else {
			System.out.println("Acesso negado!");
		}

		sc.close();

	}

}
