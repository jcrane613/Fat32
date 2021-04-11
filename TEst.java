import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TEst {
	public static void main(String[] args) throws IOException {
		RandomAccessFile randomAccessFile = new RandomAccessFile(new File("/Users/jonathancrane/Downloads/fat32.img"), "rw");
		byte[] bytes = new byte[100000];
		randomAccessFile.read(bytes);
		char[] current = bytesToHex(bytes);
		for(char c: current)
		{
			System.out.println(c);
		}


	}
	private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
	public static char[] bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = HEX_ARRAY[v >>> 4];
			hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
		}
		return hexChars;
	}
}
