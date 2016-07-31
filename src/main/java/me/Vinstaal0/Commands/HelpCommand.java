package me.Vinstaal0.Commands;

public class HelpCommand implements CommandExecutor {
  
     @Command(aliases = {"!help"}, description = "Returns a list of commands")
	  public void onCommand(Command command, String[] args) {
		    command.reply("!GetRole");
		    command.reply("!Ping");
		    command.reply("!Playing");
		    command.reply("!Role");
		    command.reply("!Server");
		    command.reply("!Help");
	}

}
