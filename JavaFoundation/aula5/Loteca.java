package aula5;

public class Loteca {

	public static void main(String[] args) {
		// Esse código gera 4 cartões com números aleatórios para um jogo
		
		for (int cartao = 1; cartao <= 4; cartao++) {
			String jogo = "";
			for (int numJogo = 1; numJogo <= 6; numJogo++) {
				int nGerado = (int) (Math.random() * 61);
				jogo += nGerado + " ";
				
			}
			System.out.println("Os números do cartão (\"" + cartao + "\") são: " + jogo);
			}
	}

}
