package deneme;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class main {

	public static int fonk(int a, int b, Anonim anonim) {
		   return anonim.call(a, b) * 2;
		};
	
		
	public static void main(String[] args) throws IOException {
		
	System.out.println(fonk(2, 3, (a, b) -> a + b));	 

	}

}
