package aula8;

public class TestaEmpregado {
	
	public static void main(String[] args) {
		Empregado funssa = new Empregado();
		
		funssa.setNome("Antônio"); //Herdado da classe Pessoa
		funssa.setRg("25.786.038-9"); //Herdado da classe PessoaFísica
		funssa.setCartao("RP854"); // Herdado da própria classe Empregado
		
		System.out.println(funssa.getNome());
		System.out.println(funssa.getRg());
		System.out.println(funssa.getCartao());
	}

}

