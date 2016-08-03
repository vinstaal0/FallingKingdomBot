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
