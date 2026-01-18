package aula8;

public class Funcionario {
	private String nome;
	private int cpf;
	private double salario;
	
	public String getNome () {
		return nome;
	}
	
	public int getCpf () {
		return cpf;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	
}
