package me.Vinstaal0;

import com.google.common.util.concurrent.FutureCallback;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.sdcf4j.CommandHandler;
import de.btobastian.sdcf4j.handler.JavacordHandler;
import me.Vinstaal0.Commands.GetRoleCommand;
import me.Vinstaal0.Commands.PingCommand;
import me.Vinstaal0.Commands.PlayingCommand;
import me.Vinstaal0.Commands.RoleCommand;
import me.Vinstaal0.Commands.ServerCommand;
import me.Vinstaal0.Listener.MessageListener;
import me.Vinstaal0.Listener.ServerListener;

public class Main {
	
	// Join link: https://discordapp.com/oauth2/authorize?client_id=204174001856053248&scope=bot&permissions=0
	
	public static DiscordAPI api;
	
	public static void main(String[] args) {
		String token = "TOKEN";
//		final String game = "Play.FallingKingdom.net";
		
		api = Javacord.getApi(token, true);
		
		api.connect(new FutureCallback<DiscordAPI>() {

			public void onSuccess(DiscordAPI api) {
				api.setGame("Play.FallingKingdom.net");

			}

			public void onFailure(Throwable api) {
				api.printStackTrace();
				
			}

		});	
		
		MessageListener msgListener = new MessageListener();
		api.registerListener(msgListener);
		
		ServerListener serverListener = new ServerListener();
		api.registerListener(serverListener);
		
		CommandHandler cmdHandler = new JavacordHandler(api);
		
		cmdHandler.registerCommand(new PingCommand());
		cmdHandler.registerCommand(new ServerCommand());
		cmdHandler.registerCommand(new GetRoleCommand());
		cmdHandler.registerCommand(new RoleCommand());
		cmdHandler.registerCommand(new PlayingCommand());
		cmdHandler.registerCommand(new HelpCommand());
		cmdHandler.registerCommand(new RPSCommand());
				
	}

}
