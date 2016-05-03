/*
 * Assignment-2: Read from the File channel and write to byte buffer.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileRead {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("E:emp.txt");
			FileChannel fc = fis.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(64);
			//
			// read from fc channel and store into destination buffer
			//
			int numOfbyteread = (byte) fc.read(buffer);
			//
			// while byteread counter decrease to -1 , end of file.
			//
			while (numOfbyteread != -1) {
				System.out.println("Read: " + numOfbyteread);
				buffer.flip();
				//
				// flip buffer for pointing to first position
				//
				while (buffer.hasRemaining()) {
					System.out.print((char) buffer.get());
				}
				buffer.clear();// set to zero
				numOfbyteread = fc.read(buffer);
			}
			fis.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
