package aula5;

public class ContaComConstrutor {
	private String nome;         // variável da instância
	
	// O construtor inicializa nome com parâmetro nome
	public ContaComConstrutor(String nome) { // O nome do construtor é o nome da classe
		this.nome = nome;
	}
	
	// Método que vai configurar o nome do objeto 
	public void setNome(String nome) { // <-- Este é o cabeçalho do método 
		this.nome = nome;			   // Armazena o nome 
	}
	//Método para recuperar o nome do objeto
	public String getNome() {		 // <-- Este é o cabeçalho do método
		return nome;				 // Retorna o valor do nome para o chamador
		}
		//Fim da classe ContaComConstrutor

}
