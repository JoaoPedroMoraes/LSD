import javax.swing.JOptionPane;
import java.io.*;
import java.util.Date;
import java.net.Socket;

public class ClienteTCPBasico{
	public static void main(String[] args){
		try{
			//Socket cliente = new Socket("127.0.0.1",12345);
			Socket cliente = new Socket ("10.16.4.46",12345);
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			Date data_atual = (Date) entrada.readObject();
			JOptionPane.showMessageDialog(null, "Date recebida do servidor:"+ data_atual.toString());
			entrada.close();
			System.out.println("Conexão encerrada");
		}//fim do try
		catch(Exception e){
			System.out.println("Erro "+e.getMessage());
		}//fim do catch
	}//fim do metodo main
}//fim da classe
