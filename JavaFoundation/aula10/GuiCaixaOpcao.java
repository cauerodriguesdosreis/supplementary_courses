// Programa que cria uma janela c/ caixas de opção de exemplo

package aula10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuiCaixaOpcao extends JPanel {
	private JButton btVerificar, btMarcar, btDesmarcar;
	private JCheckBox ckIngles, ckInformatica;
	
	public GuiCaixaOpcao() {
		inicializarComponentes();
		definirEventos();
		
	}

	public void inicializarComponentes() {
		btVerificar = new JButton("Verificar");
		ckIngles = new JCheckBox ("Inglês");
		ckInformatica = new JCheckBox("Informática");
		btMarcar = new JButton("Marcar");
		btDesmarcar = new JButton("Desmarcar");
		setLayout(null);
		add(btVerificar);
		add(btMarcar);
		add(btDesmarcar);
		add(ckIngles);
		add(ckInformatica);
		btVerificar.setBounds(20, 70, 100, 20);
		btMarcar.setBounds(20, 100, 100, 20);
		btDesmarcar.setBounds(20, 130, 100, 20);
		ckIngles.setBounds(15, 15, 100, 25);
		ckInformatica.setBounds(15, 40, 100, 25);
	}
	
	private void definirEventos() {
		btMarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ckInformatica.setSelected(true);
				ckIngles.setSelected(true);
			}
		});
		
		btDesmarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ckInformatica.setSelected(false);
				ckIngles.setSelected(false);
			}
		});
		
		btVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String selecao = "Selecionados: ";
				if (ckIngles.isSelected()) {
					selecao += "\nInglês";
				}
				
				if (ckInformatica.isSelected()) {
					selecao += "\nInformática";
				}
				
				JOptionPane.showMessageDialog(null, selecao);
			}
		});
	}
}
