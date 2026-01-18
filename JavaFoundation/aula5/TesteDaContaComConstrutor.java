package aula5;

//Usando o construtor de ContaCOmCOnstrutor para inicializar a variável de instância "nome' no momento em que cada objeto é criado

public class TesteDaContaComConstrutor {

	public static void main(String[] args) {
		// Cria dois objetos Contaobjetos ContaComConstrutor
		ContaComConstrutor conta1 = new ContaComConstrutor("Professor Pardal");
		ContaComConstrutor conta2 = new ContaComConstrutor("Lampadinha");
		
		// Exibe o valor inicial de cada conta
		System.out.printf("Nome da conta1 é: %s", conta1.getNome());
		System.out.printf("\nNome da conta2 é: %s", conta2.getNome());
		
		//Fim da classe TesteContaComConstrutor

	}

}
