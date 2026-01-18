package aula6;

public class GerenciadorDeRede {

	public static void main(String[] args) {
		ServidorRede servidorWeb = new ServidorRede();
		servidorWeb.hostname = "WEBSRV01";
		servidorWeb.ipaddress =  "10.0.0.19";
		servidorWeb.SistemaOperacional = "Apache on Linux";
		//servidorWeb.online = false;
		
		//Criando um objeto para servidor de Banco de Dados
		ServidorRede servidorDB = new ServidorRede();
		servidorDB.hostname = "DBSRV01";
		servidorDB.ipaddress = "10.0.0.25";
		servidorDB.SistemaOperacional = "MySQL on Windows Server";
		//ServidorDB.online = false;
		
		// Operando o servidor Web
		servidorWeb.exibirStatus();
		servidorWeb.ligar();
		servidorWeb.ping();
		servidorWeb.ping();
		servidorWeb.exibirStatus();
		
		// Operando o servidor de Banco de Dados 
		servidorDB.exibirStatus();
		servidorDB.ligar();
		servidorDB.ping();
		servidorDB.desligar();
		servidorDB.ping();
		servidorDB.exibirStatus();	

	}

}
