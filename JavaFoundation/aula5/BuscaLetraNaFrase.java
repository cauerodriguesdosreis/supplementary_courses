package aula5;

public class BuscaLetraNaFrase {

	public static void main(String[] args) {
		String frase = "Livro Java 9 - Como Programar";
		char letra = 'a';
		
		//Saída
		System.out.println("Frase: " + frase);
		System.out.println("\nÍndices: " + frase.indexOf(letra) + ", " + frase.indexOf(letra, 12) + ", " + frase.indexOf("Java"));
		System.out.println("\nÍndices: " + frase.indexOf("Java", 12));

	}

}
