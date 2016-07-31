package me.Vinstaal0.Commands;

public class HelpCommand implements CommandExecutor {
  
     @Command(aliases = {"!help"}, description = "Returns a list of commands")
	  public void onCommand(Message message, String[] args) {
		    message.reply("!GetRole");
		    message.reply("!Ping");
		    message.reply("!Playing");
		    message.reply("!Role");
		    message.reply("!Server");
		    message.reply("!Help");
	}

}
