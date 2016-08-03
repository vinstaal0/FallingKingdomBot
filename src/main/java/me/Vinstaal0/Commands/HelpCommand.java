/*
 * Copyright (C) 2016 Bastian Oppermann
 * 
 * Modified verion
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, see <http://www.gnu.org/licenses/>.
 */
 
package me.Vinstaal0.Commands;

import de.btobastian.javacord.entities.User;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class HelpCommand implements CommandExecutor {
	
	// use: https://github.com/BtoBastian/JavacordBot/blob/master/src/main/java/de/btobastian/javacordbot/commands/HelpCommand.java
  
     @Command(aliases = {"!help", "!commands"}, description = "Shows this list")
     public void onCommand(Message message, User user) {
	StringBuilder builder = new StringBuilder();
	builder.append("```xml");
	for (CommandHandler.SimpleCommand simpleCommand : commandHandler.getCommands()) {
		if (!simpleCommand.getCommandAnnotation().showInHelpPage()) {
	  		continue; // skip command
	  	}
	  	builder.append("\n");
	  	if (!simpleCommand.getCommandAnnotation().requiresMention()) {
	  		// the default prefix only works if the command doesn't requir a mention
	  		builder.append(commandHandler.getDefaultPrefix());
	  	}
	  	String usage = simpleCommand.getCommandAnnotation().usage();
	  	if (usage.isEmpty()) { // no usage specified using first alias
	  		usage = simplecommand.getCommandAnnotation().aliases()[0];
	  	}
	  	builder.append(usage);
	  	String description = simpleCommand.getCommandAnnotation().description();
	  	if (description != null) {
	  		builder.append(" | ").append(description);
	  	}
	}
	builder.append("\n```"); // end of xml code block
	user.sendMessage(builder.toString();
	  	
		    //user.sendMessage("!getrole");
		    //user.sendMessage("!ping");
		    //user.sendMessage("!playing <game>");
		    //user.sendMessage("!role");
		    //user.sendMessage("!server");
		    //user.sendMessage("!help");
		    //user.sendMessage("!rps <rock/paper/scissor>");
		    //user.sendMessage("!roll <Number>");
		    //user.sendMessage("!isunomadyet");
	}

}
