package me.Vinstaal0.Commands;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class IsUnoMadYetCommand implements CommandExecutor {
	
	@Command(aliases = {"!isunomadyet"}, description = "Is Uno mad yet?")
	public void onCommand(Server server, Message message, User user, String command, String[] args) {
		
		List<String> messages = Arrays.asList(
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
