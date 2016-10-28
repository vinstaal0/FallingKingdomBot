package me.Vinstaal0;

import com.google.common.util.concurrent.FutureCallback;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.sdcf4j.CommandHandler;
import de.btobastian.sdcf4j.handler.JavacordHandler;
import me.Vinstaal0.Commands.*;
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
		cmdHandler.registerCommand(new RollCommand());
		cmdHandler.registerCommand(new IsUnoMadYetCommand());
				
	}

public static void onTradeConfirm(InventoryClickEvent event){
            
        if(event.getSlot() < 0){return;}
        
        int slot = event.getSlot(); 
        
        if (event.getClickedInventory().getItem(slot) == null){return;}  
        
        if (event.getClickedInventory().getName().contains("Vendor") &&  slot == 26  ){
            
        event.setCancelled(true);    
        
        soldItems = vendor.getContents();     
        
         for (ItemStack i : soldItems){                    
             
              if (i != null && functions.ifGear(i.getType().toString())){             
                  
                  int tier = functions.tierNumber(i);        
                  
                  if (tier == 0){rewards.add(items.T1Scrap);} 
                  if (tier == 1){rewards.add(items.T2Scrap);}  
                  if (tier == 2){rewards.add(items.T3Scrap);}  
                  if (tier == 3){rewards.add(items.T4Scrap);}  
                  if (tier == 4){rewards.add(items.T5Scrap);}                    
                    
              }         
                 
         }
         
        createVendor(); 
                 
        for (ItemStack i : rewards){player.getInventory().addItem(i);}
        
         rewards = new ArrayList<ItemStack>();
        
        } // slot
        
    }

}
