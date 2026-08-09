import java.io.*;
import java.net.*;

public class MyClient1
{
	
	
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	
	public MyClient1()
	{
		try
		{
			
			s=new Socket("10.29.166.43",5000);
			//s=new Socket("localhost",10);
			System.out.println(s.getLocalPort());
			System.out.println(s);

			dis=new DataInputStream(s.getInputStream());
			dos=new DataOutputStream(s.getOutputStream());
			clientChat();
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	    public static void main(String []args)
		{
			new MyClient1();
		}
		
		public void clientChat()throws IOException
		{
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s1;
			do
			{
				s1=br.readLine();
				dos.writeUTF(s1);
				dos.flush();
				System.out.println("SERVER MESSAGE: "+dis.readUTF());
			}
			while(!s1.equals("stop"));
		}
		
	
}