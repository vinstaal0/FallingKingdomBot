package me.Vinstaal0.Listener;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;
import de.btobastian.javacord.listener.message.MessageDeleteListener;
import de.btobastian.javacord.listener.message.MessageEditListener;

public class MessageListener implements MessageCreateListener, MessageEditListener, MessageDeleteListener {

	public void onMessageCreate(DiscordAPI api, Message message) {
		System.out.println(message.getAuthor().getName() + ": " + message.getContent());
		
	}

	public void onMessageDelete(DiscordAPI api, Message message) {
		System.out.println("Message from " +  message.getAuthor().getName() + " was deleted!");
		
	}

	public void onMessageEdit(DiscordAPI api, Message message, String oldMessage) {
		System.out.println("Message from " + message.getAuthor().getName() + " was edited!");
		
	}
	
}
