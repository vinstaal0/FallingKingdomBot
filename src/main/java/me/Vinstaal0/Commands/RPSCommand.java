package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class RPSCommand implements CommandExecutor {
	
	@Command(aliases = {"!rps", "!rockpaperscicors"}, description = "Play rock paper scricors")
	public String onCommand(Server server, User user, String command, String[] args) {
		
		if (user.getRoles(server).contains(server.getRoleById("144529984088702978"))) {
			return "Pong!";
		}
		return null;
		
	}

}
