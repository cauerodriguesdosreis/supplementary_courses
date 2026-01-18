package aula2;

public class SaidaFormata {

	public static void main(String[] args) {
		//Várias maneiras de formatar a saída impressa
		float nota = 9.63f;
		double media = 4.9;
		String nome = "Cauê";

		// Um exemplo de saída
		System.out.println("Sua nota é: " + nota); // Concatenar é unir dois valores
		
		//Outro exemplo
		
		System.out.println("Sua nota é: " + nota); // Pula uma linha
		
		//Um exemplo de saída formatada
		System.out.printf("Sua nota é %.1f %n", nota);
		
		// Mais um exemplo de saída formatada
		System.out.printf("Sua nota é %.2f", nota);
		
		System.out.printf("\nA nota de %s é %.1f", nome, nota);
		
		
		
	}

}
