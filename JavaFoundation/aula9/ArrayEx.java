package aula9;

public class ArrayEx {

	public static void main(String[] args) {
		int[] vetor = {-45, 6, 0, 72, 1543, -89, 0, 62, -3, 1, 6453, 78};
		int soma = 0;
		double div = 0;

		
		// 1° Ex: soma
		for (int i = 0; i <= vetor.length - 10; i++) {
			soma += vetor[i];
		}
		
		System.out.print("A soma dos três primeiros elementos do array são: " + soma);
		System.out.println("\nA metade do valor do 7° elemento é: " + vetor[6] / 2);
		
	}
}
