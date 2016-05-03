import java.nio.ByteBuffer;

/*
 * Assignment-1: Read data from buffer means write data into channel.
 */
public class BufferRead {
	public static void main(String[] args) {
		ByteBuffer buffer=ByteBuffer.allocate(64);
		buffer.put((byte)60);
		buffer.put((byte)61);
		buffer.put((byte)62);
		buffer.put((byte)63);
		buffer.put((byte)64);
		
		byte[] byteArr=new byte[]{65,66,67,68,69};
		buffer.put(byteArr);
		buffer.flip();  //flip the buffer for write into the channel
		
		while(buffer.hasRemaining()){
			System.out.print(" "+(char)buffer.get());
		}
	}
}
