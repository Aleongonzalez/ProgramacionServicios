package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	private final String HOST = "localhost";
	private final int PUERTO = 9876;
	private Socket socket;
	
	public Client() throws IOException {
		socket = new Socket(HOST,PUERTO);
	}
	
	public void iniciarCliente() throws IOException {
		DataInputStream entradaServidor = new DataInputStream(socket.getInputStream());
		System.out.println(entradaServidor.readUTF());
		
		DataOutputStream salidaServidor = new DataOutputStream(socket.getOutputStream());
		salidaServidor.writeUTF("Este es el mensaje que quiero mandar");
		
		salidaServidor.close();
		entradaServidor.close();
		socket.close();
		
	}
}
