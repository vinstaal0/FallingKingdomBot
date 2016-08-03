package me.Vinstaal0.Listener;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.listener.server.ServerMemberAddListener;

public class ServerListener implements ServerMemberAddListener {

	public void onServerMemberAdd(DiscordAPI api, User user, Server server) {
		
		System.out.println(user + " has joined " + server.getName() + "!");
		
		server.getRoleById("143021185423245312").addUser(user);
		
	}
	
}
