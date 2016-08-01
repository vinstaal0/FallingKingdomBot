package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class RoleCommand implements CommandExecutor {
	
	@Command(aliases = {"!role"}, description = "gives the user the Alpha tester role")
	public void onCommand(Server server, User user) {
		
		if (user.getRoles(server).contains(server.getRoleById("144529984088702978"))) {
			server.getRoleById("143021185423245312").addUser(user);
			System.out.println(user.getName());
		}
		
	}

}
