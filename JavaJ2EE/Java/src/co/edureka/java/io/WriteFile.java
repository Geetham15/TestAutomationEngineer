package co.edureka.java.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//OutputStream fout = new FileOutputStream("src/co/edureka/java/io/edureka.txt");
		OutputStream fout = new FileOutputStream("src/co/edureka/java/io/edureka.txt",true); //append the file
		String str = "Get certified in DevOps \n";
		byte[] b = str.getBytes();
		fout.write(b);
		System.out.println("file saved!!!!");
		fout.close();
	}

}
