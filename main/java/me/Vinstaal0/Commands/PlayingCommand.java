package me.Vinstaal0.Commands;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class PlayingCommand implements CommandExecutor {
	
	@Command(aliases = {"!playing"}, description = "sets the game the bot is playing")
	public void onCommand(DiscordAPI api, Server server, User user, Message message, String[] args) {
		
		
		try {
			if (user.getRoles(server).contains(server.getRoleById("144529984088702978"))) {
				if (args.length == 0) {
					message.reply("Invalid arguments");
				} else {
					String game = "";
					
					int length = args.length;
					
					for (int i = 0; i < length; i++) {
						
						game = game + " " + args[i];
						
					}
					
					api.setGame(game);
					
				}
		
			}
		} catch (Exception e){
			e.printStackTrace();
			message.reply("An error occured");

		}
		
	}

}
