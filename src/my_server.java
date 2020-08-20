import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class my_server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss= new ServerSocket(1234);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			String str=(String)din.readUTF();
			System.out.println("client says:"+str);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
