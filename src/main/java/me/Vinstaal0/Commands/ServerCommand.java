package me.Vinstaal0.Commands;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class ServerCommand implements CommandExecutor {
	
	@Command(aliases = {"!server"}, description = "Returns the server IP")
	public String onCommand(String command, String[] args) {
		return "The IP for the FallingKingdom Minecraft server is: **play.fallingkingdom.net**";
	}


}
