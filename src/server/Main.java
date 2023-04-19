package server;

import java.io.IOException;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Server serv = new Server();
		System.out.println("Iniciando servidor . . . .");
		
		serv.iniciarServidor();
		
		serv.finalizarServer();
	}

}
