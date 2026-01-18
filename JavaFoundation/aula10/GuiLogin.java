package aula10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiLogin extends JFrame {
	private JTextField tflogin;
	private JLabel lbSenha;
	private JLabel lblogin;
	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	private static GuiLogin frame;
	
	public GuiLogin() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setTitle("Login no sistema");
		setBounds(0, 0, 250, 200);
		setLayout(null);
		tflogin =  new JTextField(5);
		pfSenha = new JPasswordField(5);
		lbSenha = new JLabel ("Senha");
		lblogin = new JLabel ("Login: ");
		btLogar = new JButton ("Logar");
		btCancelar = new JButton ("Cancelar");
		tflogin.setBounds(100, 30, 120, 25);
		lblogin.setBounds(30, 30, 80, 25);
		lbSenha.setBounds(30, 75, 80, 25);
		pfSenha.setBounds(100, 75, 120, 25);
		btLogar.setBounds(20, 120, 100, 25);
		btCancelar.setBounds(125, 120, 100, 25);
		add(tflogin);
		add(lbSenha);
		add(lblogin);
		add(btLogar);
		add(btCancelar);
		add(pfSenha);
	}
	
	private void definirEventos() {
		btLogar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(pfSenha.getPassword());
				if (tflogin.getText().equals("Java 8") && senha.equals("Java8")) {
					frame.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Login ou senha inválidos!");
				}
			}
			
		});
		
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
				);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {
				public void run() {
					frame = new GuiLogin();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
					frame.setVisible(true);
		}
		
		});
	}
}
