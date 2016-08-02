package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class HelpCommand implements CommandExecutor {
  
     @Command(aliases = {"!help"}, description = "Returns a list of commands")
	  public void onCommand(Message message, User user, String[] args) {
		    user.sendMessage("!getrole");
		    user.sendMessage("!ping");
		    user.sendMessage("!playing <game>");
		    user.sendMessage("!role");
		    user.sendMessage("!server");
		    user.sendMessage("!help");
		    user.sendMessage("!rps <rock/paper/scissor>");
		    user.sendMessage("!roll <Number>");
		    user.sendMessage("!isunomadyet");
	}

}
