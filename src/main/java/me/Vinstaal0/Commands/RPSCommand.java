package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import me.Vinstaal0.Commands.Enums.*;
import me.Vinstaal0.Commands.Enums.EnumHelp;

public class RPSCommand implements CommandExecutor {
	
	@Command(aliases = {"!rps", "!rockpaperscissors"}, description = "Play rock paper scissors")
	public void onCommand(Server server, User user, Message message, String command, String[] args) {
		
		if (args.length == 0) {
			message.reply("Invalid arguments");
		} else if (args.length > 1) {
			message.reply("Invalid ämount of arguments, max is 1");
		} else {
			try {
				RPS rps = RPS.valueOf(args[0]);
				
				RPS cpuRps = EnumHelp.randomEnum(RPS.class);
				
				if (rps == cpuRps) {
					message.reply("Draw! I chose " + cpuRps + "!");
				} else if (rps == RPS.ROCK && cpuRps == RPS.PAPER) {
					message.reply("You lose! " + user.getMentionTag() + "! I chose " + cpuRps + "!");
				} else if (rps == RPS.ROCK && cpuRps == RPS.SCISSORS) {
					message.reply("You win! " +  user.getMentionTag() + "! ! chose " + cpuRps + "!");
				} else if (rps == RPS.PAPER && cpuRps == RPS.SCISSORS) {
					message.reply("You lose! " + user.getMentionTag() + "! I chose " + cpuRps + "!");
				} else if (rps == RPS.PAPER && cpuRps == RPS.ROCK) {
					message.reply("You win! " +  user.getMentionTag() + "! ! chose " + cpuRps + "!");
				} else if (rps == RPS.SCISSORS && cpuRps == RPS.ROCK) {
					message.reply("You lose! " + user.getMentionTag() + "! I chose " + cpuRps + "!");
				} else if (rps == RPS.SCISSORS && cpuRps == RPS.PAPER) {
					message.reply("You win! " +  user.getMentionTag() + "! ! chose " + cpuRps + "!");	
				} else {
					message.reply("Debug: Player gues = " + rps + " ,CPU Gues = " + cpuRps);
				}

			} catch (IllegalArgumentException e) {
				message.reply("Please enter rock, paper or scissors");
			}
			
		}
		
	}

}
