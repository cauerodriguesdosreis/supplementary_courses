package aula10;

import javax.swing.JOptionPane;

public class Adição {

	public static void main(String[] args) {
		// Obtém a entrada do usuário a partir dos diálogos de entrada JOptionPane 
		String primeiroNumero = JOptionPane.showInputDialog("Entre o primeiro inteiro: ");
		String segundoNumero = JOptionPane.showInputDialog("Entre o segundo inteiro: ");
		
		// Converte String em valores int para uso em um cálculo
		int n1 = Integer.parseInt(primeiroNumero);
		int n2 = Integer.parseInt(segundoNumero);
		
		int soma = n1 + n2;
		
		// Exibe o resultado em diálogo de mensagem JOptionPane
		JOptionPane.showMessageDialog(null, "A soma é " + soma, "Soma de Dois Inteiros", JOptionPane.QUESTION_MESSAGE);
		
		

}
}
