package d20181011;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx01 {
	public static void main(String[] args) throws UnknownHostException {
		//ip
		InetAddress inet = InetAddress.getLocalHost();
		
		System.out.println(inet);
		String name = inet.getHostName();
		System.out.println(name);
		System.out.println(inet.getHostAddress());
		//System.out.println(inet.);
		System.out.println("0------------------------------0");
		
		//다음 웹사이트 정보가 궁금하면?
		InetAddress inet2 = InetAddress.getByName("www.marumaru.in");
		System.out.println(inet2);
		
		
		
	}
}
