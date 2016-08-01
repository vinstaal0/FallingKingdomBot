package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class RPSCommand implements CommandExecutor {
	
	public enum RPS {ROCK, PAPER, SCISSORS}
	
	@Command(aliases = {"!rps", "!rockpaperscissors"}, description = "Play rock paper scissors")
	public String onCommand(Server server, User user, String command, String[] args) {
		
		Random rnd = new Random(3);
		RPS rps;
		String gues;
		
		if (args.length == 0) {
			message.reply("Invalid arguments");
		} else if (args.length > 1) {
			message.reply("Invalid arguments, max is 1");
		} else {
			gues = args[0];
		}
		
		
		
	}

}
