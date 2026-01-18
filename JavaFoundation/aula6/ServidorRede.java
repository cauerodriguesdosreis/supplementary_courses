package aula6;

public class ServidorRede {
	// Atributos
	String hostname;
	String ipaddress;
	String SistemaOperacional;
	boolean online;

	// Método para ligar o servidor
	public void ligar() {
		this.online = true;
		System.out.println("Servidor " + this.hostname + " (" + this.ipaddress + ") foi LIGADO.");
	}

	public void desligar() {
		this.online = false;
		System.out.println("Servidor " + this.hostname + " (" + this.ipaddress + ") foi DESLIGADO.");
	}
	
	// Método para exibir o status do servidor
	
	public void exibirStatus() {
		System.out.println("\n--- Status do servidor --- \n");
		System.out.println("Hostname: " + this.hostname);
		System.out.println("IP: " + this.ipaddress);
		System.out.println("Sistema Operacional: " + this.SistemaOperacional);
		System.out.println("Status: " + (this.online ? "Online" : "Offline"));
	}
	
	// Método para simular um ping
	public boolean ping() {
		if (this.online) {
			System.out.println("Ping para " + this.ipaddress + ": Sucesso (64 bytes, ttl=64, time= 1ms)");
			return true;
		}
		else {
			System.out.println("Ping para " + this.ipaddress + ": Falha (Host de destino inacessível).");
			return false;
		}
		
	}
}
