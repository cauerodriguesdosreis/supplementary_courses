package aula8;

public class PessoaJurídica extends Pessoa {

	private String cnpj;
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void mostraClasse() {
		System.out.println("\nClasse PessoaJurídica!");
	}
	
	
}
