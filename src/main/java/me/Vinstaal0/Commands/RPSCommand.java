package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import me.Vinstaal0.Commands.Enums.*;

public class RPSCommand implements CommandExecutor {
	
	@Command(aliases = {"!rps", "!rockpaperscissors"}, description = "Play rock paper scissors")
	public String onCommand(Server server, User user, String command, String[] args) {
		
		if (args.length == 0) {
			message.reply("Invalid arguments");
		} else if (args.length > 1) {
			message.reply("Invalid ämount of arguments, max is 1");
		} else {
			try {
				RPS rps = RPS.valueOf(args[0]);
				
				RPS cpuRps = randomEnum(RPS);
				
				if (rps == cpuRps) {
					message.reply("Draw! I chose " + cpuRps + "!");
				} else if (rps == ROCK && cpuRps == PAPER) {
					message.reply("You lose! " + user.getName() + "! I chose " + cpuRps + "!");
				} else if (rps == ROCK && cpuRps == SCISSORS) {
					message.reply("You win! " +  user.getName() + "! ! chose " + cpuRps + "!");
				} else if (rps = PAPER && cpuRps == SCISSORS) {
					message.reply("You lose! " + user.getName() + "! I chose " + cpuRps + "!");
				} else if (rps = PAPER && cpuRps == ROCK) {
					message.reply("You win! " +  user.getName() + "! ! chose " + cpuRps + "!");
				} else if (rps = SCISSORS && cpuRps == ROCK) {
					message.reply("You lose! " + user.getName() + "! I chose " + cpuRps + "!");
				} else if (rps = SCISSORS && cpuRps == PAPER) {
					message.reply("You win! " +  user.getName() + "! ! chose " + cpuRps + "!");	
				} else {
					message.reply("Debug: Player gues = " + rps + " ,CPU Gues = " + cpuRps);
				}
				
			} catch (IllegalArgumentException e) {
				message.reply("Please enter rock, paper or scissors");
			}
			
		}
		
	}

}
