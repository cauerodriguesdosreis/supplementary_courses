package aula3;

import java.util.Scanner;

public class StatusServidor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int server;
		int ideal = 200;
		
		System.out.println("Olá! Bem-vindo à verificação de status de servidores!");
		System.out.print("Informe o valor em milissegundos (ms) que seu servidor está atuando: ");
		server = sc.nextInt();
		
	    
	    
	    if (server<=ideal) {
			System.out.println("Servidor ativo!");
		} else {
			System.out.println("Servidor inativo!");
		}
		
		
		sc.close();

	}

}
