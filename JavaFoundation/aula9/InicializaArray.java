package aula9;

public class InicializaArray {

	public static void main(String[] args) {
		// Declara o array e inicializa com um objeto array
		int[] vetor = {2, 5, 78, 90, 3, 67, 44, 32, 11, 100}; // Cria o objeto chamado "vetor"

		// Saída

		System.out.printf("%s%8s\n", "Índice", "Valor"); // Título

		// Gera a saída do valor de cada elemento
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.printf("%3d%9d\n", (contador + 1), vetor[contador]);
		}

	}

}
