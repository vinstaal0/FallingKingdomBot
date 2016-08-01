package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class RollCommand implements CommandExecutor {
	
	@Command(aliases = {"!roll"}, description = "Allows the user to roll for a number between 0 and x")
	public void onCommand(Server server, User user, String command, String[] args) {
		
		if (args.length != 1) {
			message.reply("Invalid arguments");
		}
		
		int number = args[0];
		
		if (number.lenght > 5) {
			message.reply("Invalid arguments, max number is 10000");
		}
		
		if (number < 0) {
			message.reply("Invalid arguments, non postive number");
		}
		
		Random rnd = new Random();
		
		//int roll;
		
		try {
			int roll = rnd.nextInt(Integer.parseInt(number) + 1);
			
			message.reply(user.getName() + " has rolled a " + "**" + roll "**" + "!";
			
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			message.reply("Invalid arguments, non number");
		}
	}

}
