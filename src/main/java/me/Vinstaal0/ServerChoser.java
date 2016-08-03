package me.Vinstaal0;

public class ServerChoser {
  
  public enum servers {
     FALLINGKINGDOM("131434184857092096"),
     VINSTAAL0DISCORD("109272327514005504"),
     REALMGUILD("209719487572738049")
    
     private String id;
    
     private servers(String id) {
          this.id = id;
       }
  }
  
  public String getServerName(Server server) {
      
      if (server.getId() == servers.FALLINGKINGDOM.getValue()) {
         return servers.FALLINGKINGDOM.toString();
      } else if (server.getId() == servers.VINSTAAL0DISCORD.getValue()) {
         return servers.VINSTAAL0DISCORD.toString();
      } else if (server.getId() == servers.REALMGUILD.getValue()) {
         return servers.REALMGUILD.toString();
      } else {
         return null;
      }
    
  };
  
  public boolean isFallingKingdom(Server server) {
      if (server.getId() == "131434184857092096") {
          return true;
      }   else {
          return false;
      }
  }
  
  public boolean isVinstaal0Discord(Server server) {
      if (server.getId() == "109272327514005504") {
          return true;
      }   else {
          return false;
      }
  }
  
  public boolean isRealmGuild(Server server) {
      if (server.getId() == "209719487572738049") {
          return true;
      }   else {
          return false;
      }
  }

}
