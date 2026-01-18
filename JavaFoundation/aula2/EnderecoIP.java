package aula2;

import java.util.Scanner;

public class EnderecoIP {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá!");
		System.out.print("Digite seu endereço IP: ");
		String endereco = teclado.next();

		System.out.printf("Endereço IP registrado com sucesso! %s", endereco);

		teclado.close();

	}

}
