package aula3;

public class OperadorLogicoE {

	public static void main(String[] args) {
	
		int salario = 1100;
		int idade = 19;
		
		boolean emp_aprovado = (salario >= 1000 && idade >= 19);
		
		System.out.println("O empréstimo foi considerado: " + emp_aprovado);
	}

}
