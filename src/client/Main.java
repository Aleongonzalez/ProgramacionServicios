package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		final String HOST = "localhost";
		final int PUERTO = 9876;
		DataInputStream in;
		DataOutputStream out;
		
		Socket sc = new Socket(HOST,PUERTO);
		in = new DataInputStream(sc.getInputStream());
		out = new DataOutputStream(sc.getOutputStream());
		
		out.writeUTF("Hola desde el cliente");
		
		String mensaje = in.readUTF();
		System.out.println(mensaje);
		
		sc.close();
	}

}
