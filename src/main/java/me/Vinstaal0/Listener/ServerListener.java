package me.Vinstaal0.Listener;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.listener.server.ServerMemberAddListener;

public class ServerListener implements ServerMemberAddListener {

	public void onServerMemberAdd(DiscordAPI api, User user, Server server) {
		
		server.getChannelById("#207175409572249601").sendMessage(user + " has joined the server!");
		
		server.getRoleById("143021185423245312").addUser(user);
		
	}
	
}
