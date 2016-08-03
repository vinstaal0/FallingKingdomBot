package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class GetRoleCommand implements CommandExecutor {
	
	@Command(aliases = {"!getrole"}, description = "prints a list of all roles + ID's", requiredPermission = "serverinfo")
	public void onCommand(Server server, User user, Message message) {
		
		System.out.println(server.getRoles());
		message.reply(server.getRoles().toString());
			
	}

}
