package aula8;

import javax.swing.JOptionPane;

public class PessoaMuitasFormas {

	public static void main(String[] args) {
		Pessoa mano = null;

		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número de 1 a 4: "));
		
		switch (tipo) { 
		case 1:
			mano = new Pessoa(); break;
			
		case 2:
			mano = new PessoaFisica(); break;
			
		case 3: 
			mano = new PessoaJurídica(); break;
		case 4:
			mano = new Empregado(); break;
			
			default: {
				System.out.println("Tipo desconhecido!");
				System.exit(0);    // Encerra a execução da classe
			}
		}
		
		mano.mostraClasse();
			
	}

}
