import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Assignment-3: Create a simple chat application (Client-Server)
 * Date: 24/7/12
 */
public class ServerChat {

	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int port = 6666;

		ServerSocket servsock = new ServerSocket(port);
		Socket connection = servsock.accept();
		System.out.println("Yep.. Client connected.. Start chatting..!! ");

		InputStream input = connection.getInputStream();
		OutputStream output = connection.getOutputStream();
		DataInputStream serverin = new DataInputStream(input);
		DataOutputStream serverout = new DataOutputStream(output);

		DataInputStream clientin = new DataInputStream(input);
		DataOutputStream clientout = new DataOutputStream(output);

		System.out.println("Type and HIT enter...'bye' to close session");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		String receline = null;
		String sendline = null;

		while (true) {
			receline = serverin.readUTF();
			System.out.println("Server: " + receline);
			clientout.writeUTF(receline);
			sendline = buffer.readLine();
			serverout.writeUTF(sendline);
			sendline = clientin.readUTF();

		}

	}

	public void run() {

	}

}
