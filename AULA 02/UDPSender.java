import java.net.*;

public class UDPSender{
	public static void main(String[] args) throws Exception{
		//instanciar um obj DatagramSocket - UDP
		DatagramSocket ds = new DatagramSocket();

		String str = "Enviando dados por Soquete UDP"; //dado da msg

		InetAddress ip = InetAddress.getByName("127.0.0.1"); //ip destino

		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000); //Criando datagrama

		ds.send(dp);

		ds.close();
	}
}
