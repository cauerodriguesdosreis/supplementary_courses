package aula8;

import java.text.DecimalFormat;

public class UmArrayNumeros {

	public static void main(String[] args) {
		int[] inteiro = new int[10]; // Cria o array inteiro com 10

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("000");

		for (int i = 0; i < inteiro.length; i++) {
			inteiro[i] = (int) (Math.random() * 1000);
			System.out.printf("%d - ", (i + 1));
			System.out.println(df.format(inteiro[i]));
		}
	}

}
