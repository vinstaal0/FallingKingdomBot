package me.Vinstaal0.Commands;

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
