import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.io.IOException;
//import java.io.*
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCPBasico{
	public static void main(String [] args){
		try{
			while(true){
				ServerSocket servidor = new ServerSocket(12345);
				System.out.println("Servidor ouvindo a porta 12345");
				//o metodo aceept bloqueia o servidor até o servidor receba um pedido de conexão
				Socket cliente = servidor.accept();
				System.out.println("Cliente conectado: "+ cliente.getInetAddress().getHostAddress());

				//Produzindo e enviando a resposta
				ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
				saida.flush();
				saida.writeObject(new Date());
				saida.close();
				cliente.close();

			}//fim do while
		}//fim do try
		catch(Exception e){
			System.out.println("Erro: "+ e.getMessage());
		}//fim do catch
	}//fim do metodo
}//fim da class
