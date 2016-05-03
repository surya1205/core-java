import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * Assignment-3: Create a simple chat application (Client-Server)
 * Date: 24/7/12
 */
public class ClientChat {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int servport = 6666;
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("Any of you heard of a socket with IP address " + ip
				+ " and port " + servport + "?");
		Socket connection = new Socket(ip, servport);
		System.out.println("Yep.. Server connected.. Now start chatting..!! ");

		/*
		 * Thread send = new ClientChat(); Thread receive = new ClientChat();
		 * send.start(); receive.start();
		 */

		InputStream input = connection.getInputStream();
		OutputStream output = connection.getOutputStream();
		DataInputStream clientin = new DataInputStream(input);
		DataOutputStream clientout = new DataOutputStream(output);

		DataInputStream serverin = new DataInputStream(input);
		DataOutputStream serverout = new DataOutputStream(output);

		String sendline = null;
		String receline = null;
		System.out.println("Type and HIT enter...'bye' to close session");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {
			sendline=buffer.readLine();
			clientout.writeUTF(sendline);
			sendline = serverin.readUTF();
			receline=clientin.readUTF();
			System.out.println("Server: " + receline);
			serverout.writeUTF(receline);		
		}
		
	}

}
