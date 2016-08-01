package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import me.Vinstaal0.Commands.Enums.*;

public class RPSCommand implements CommandExecutor {
	
	@Command(aliases = {"!rps", "!rockpaperscissors"}, description = "Play rock paper scissors")
	public String onCommand(Server server, User user, String command, String[] args) {
		
		Random rnd = new Random(3);
		String gues;
		
		if (args.length == 0) {
			message.reply("Invalid arguments");
		} else if (args.length > 1) {
			message.reply("Invalid ämount of arguments, max is 1");
		} else {
			try {
				RPS rps = RPS.valueOf(args[0]);
				
				message.reply("Computer guesed: " + randomEnum(RPS));
				
			} catch (IllegalArgumentException e) {
				message.reply("Please enter rock, paper or scrissors");
			}
		}
		
	}

}
