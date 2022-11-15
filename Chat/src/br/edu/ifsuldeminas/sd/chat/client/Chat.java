package br.edu.ifsuldeminas.sd.chat.client;

import java.util.Scanner;
import br.edu.ifsuldeminas.sd.chat.ChatException;
import br.edu.ifsuldeminas.sd.chat.ChatFactory;
import br.edu.ifsuldeminas.sd.chat.MessageContainer;
import br.edu.ifsuldeminas.sd.chat.Sender;
public class Chat {
	public static String KEY_TO_EXIT = "q";
	public static int RECEIVER_BUFFER_SIZE = 1000;
	public static void chat(String from,String message,Sender sender){
	
		try {
		
				message = String.format("%s%s%s", message,
						MessageContainer.FROM, from);
				if (!message.equals("")) {
					if (message.equals("q"))

						System.exit(0);
					else
						sender.send(message);
				}
			
		} catch (ChatException chatException) {
			System.err.printf(String.format(
					"Houve algum erro no chat. Mensagem do erro: %s",
					chatException.getCause().getMessage()));
		} finally {
			
		}
	}
}