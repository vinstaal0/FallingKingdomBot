package me.Vinstaal0.Commands;

import java.util.Random;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class RollCommand implements CommandExecutor {
	
	@Command(aliases = {"!roll"}, description = "Allows the user to roll for a number between 0 and x")
	public void onCommand(Server server, User user, Message message, String command, String[] args) {
		
		if (args.length != 1) {
			message.reply("Invalid arguments");
		}
		
		if (args[0].length() > 5) {
			message.reply("Invalid arguments, max number is 10000");
		}
		
		if (args[0].length() < 0) {
			message.reply("Invalid arguments, non postive number");
		}
		
		Random rnd = new Random();
		
		//int roll;
		
		try {
			int roll = rnd.nextInt(Integer.parseInt(args[0]) + 1);
			
			message.reply(user.getName() + " has rolled a " + "**" + roll + "**" + "!");
			
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			message.reply("Invalid arguments, non number");
		}
	}

}
