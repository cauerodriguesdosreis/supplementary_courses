package aula5;

public class SenhaAleatoria {

	public static void main(String[] args) {
		int senha = 0;
		// Processamento
		
		for (int i = 1; i <= 10; i++) {
			int num = (int) (Math.random() * 10);
			senha += num;
		}
		
		System.out.println("Senha: " + senha);

	}

}
