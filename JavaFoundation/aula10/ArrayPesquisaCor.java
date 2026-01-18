package aula10;

import javax.swing.JOptionPane;

public class ArrayPesquisaCor {

	public static void main(String[] args) {
	
		String[] cores = {"Verde", "Amarelo", "Azul", "Vermelho", "Preto"};
		
		String cor = JOptionPane.showInputDialog("Forneça uma cor: ");
		
		String mensagem = "Cor não encontrada";
		
		for (String elemento : cores) {
			if (elemento.equals(cor)) {
				mensagem = "Cor encontrada!";
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
		System.exit(0);

	}

}
