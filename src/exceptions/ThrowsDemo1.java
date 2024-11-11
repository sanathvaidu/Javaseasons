package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo1 {

	public static void main(String[] args) throws  InterruptedException {
		try {
			new FileInputStream("D:\\FLM15thjuly WS\\Javaseasons/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("make sure file is available next line..");
		}

		Thread.sleep(3000);
		
		System.out.println("end of program..");

	}

	
}
