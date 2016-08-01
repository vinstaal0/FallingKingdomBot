package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class IsUnoMadYetCommand implements CommandExecutor {
	
	@Command(aliases = {"!isunomadyet"}, description = "Is Uno mad yet?")
	public void onCommand(Server server, User user, String command, String[] args) {
		
		public static List<String> messages = Array.asList(
			"You better run...",
			"Nah he's cool",
			"Shit is about to go down",
			"He ain't even there",
			"Uno who?",
			"He's fine...",
			"About to break down",
			"He's ravin...!"
			);
			
		message.reply(messages.get(new Random().nextInt(messages.size())));
		
	}

}
