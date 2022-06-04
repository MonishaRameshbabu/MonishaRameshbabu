import java.net.InetAddress;
import java.net.UnknownHostException;

public class myIpAddress {

	public static void main(String[] args) {
		try {
			InetAddress ip=InetAddress.getLocalHost();
			System.out.println("my IP addrs:"+ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch blockS
			e.printStackTrace();
		}
	}

}
