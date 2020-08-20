import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class my_client {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",1234);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF("hello i am client and my name is abc");
		dout.flush();
		dout.close();
		s.close();

	}

}


//port no
//ip address
// socket
//protocol
// connection oriented tcp
// connection less udp
// mac adress