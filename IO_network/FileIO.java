/*
 * Assignment-1: Read input data from keyboard & write it to a file “File1”.
                 Copy contents of File1 to File2.
 Date: 23/7/12

 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class FileIO {

	public static void main(String[] args) throws IOException {
		File fis = new File("E:emp.txt");
		File fos = new File("E:temp.txt");
		FileInputStream in = new FileInputStream(fis);
		FileOutputStream out = new FileOutputStream(fos);

		FileWriter fw = new FileWriter("E:emp.txt");
		PrintWriter pw = new PrintWriter(fw);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Write something... 'quit' to stop");
		String line = br.readLine();

		while (!line.equals("quit")) {
			pw.print(line);
			line = br.readLine();
		}
		System.out.println("Contents are copied to file...");
		pw.close();
		isr.close();

		//copy content emp.txt to temp.txt...
		byte[] buff = new byte[1024];
		int len;
		while ((len = in.read(buff)) > 0) {
			out.write(buff, 0, len);
		}
		System.out.println("file Contents are copied another file....");

	}

}
