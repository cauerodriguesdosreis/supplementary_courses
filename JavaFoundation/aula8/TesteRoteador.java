package aula8;

public class TesteRoteador {

	public static void main(String[] args) {
		Roteador r = new Roteador();
		r.fabricante = "Cisco";	// Herdado da classe mãe
		r.qtDePortas = 4;
		
		r.exibirInfo(); 		// Herdado da classe pai
		r.configurar(); 		// Herdado da classe filha
		

	}

}
