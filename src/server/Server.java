package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	private final int PUERTO = 9876;
	private ServerSocket serverSocket;
	private Socket socket;
	
	public Server() throws IOException {
		serverSocket = new ServerSocket(PUERTO);
		socket = new Socket();
	}
	
	public void iniciarServidor() throws IOException {
		while(true) {
			System.out.println("Esperando la conexion del cliente");
			socket = serverSocket.accept();
			DataOutputStream mensajeCliente = new DataOutputStream(socket.getOutputStream());
			mensajeCliente.writeUTF("\t- Peticion recibida");
			DataInputStream entrada = new DataInputStream(socket.getInputStream());
/*			
			String mensajeDeCliente;
			try {
				while(!(mensajeDeCliente = entrada.readUTF()).isEmpty()) {
					System.out.println(mensajeDeCliente);
				}
				} catch (EOFException ex) {
					System.out.println("Fin de la comunicacion");
				}
*/	
		}
	
	}
	
	
    public void finalizarServer() throws IOException {
        serverSocket.close();
    }
}
