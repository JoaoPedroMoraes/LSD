import java.net.*;

public class UDPReceiver{
	public static void main (String[] args) throws Exception{

		//Cria o obj do tipo soquete datagrama
		DatagramSocket ds = new DatagramSocket (3000);

		//Cria um buffer para receber os dados
		byte [] buf = new byte[1024];

		//Cria um pacote datagrama
		DatagramPacket dp = new DatagramPacket(buf, 1024);

		System.out.println("Aguardando recebimento");

		//recebe os dados e armazena em dp
		ds.receive(dp);

		//Exibe os dados recebidos
		String str = new String(dp.getData(), 0, dp.getLength());
		System.out.println(str);

		System.out.println("Dados recebidos");
		//Fim
		ds.close();
	}
}
