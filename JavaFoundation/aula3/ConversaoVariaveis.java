package aula3;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoVariaveis {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.US);
		double numero;
		
		System.out.println("Olá!");
		System.out.print("Digite algum número: ");
		numero = sc.nextDouble();
		
		double teste = (int) Math.pow(numero, 2);
		
		System.out.println("O quadrado de " + numero + " é igual a: " + teste);
		
		sc.close();

	}

}
