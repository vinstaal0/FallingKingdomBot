package me.Vinstaal0;

public class ServerChoser {
  
  public enum _Server {
     FALLINGKINGDOM("131434184857092096"),
     VINSTAAL0DISCORD("109272327514005504"),
     REALMGUILD("209719487572738049")
    
     private String id;
    
     private servers(String id) {
          this.id = id;
       }
    
     
  }
  
  public _Servers getServerName(Server server) {
      
      if (server.getId() == _servers.FALLINGKINGDOM.getValue()) {
         return _servers.FALLINGKINGDOM;
      } else if (server.getId() == _servers.VINSTAAL0DISCORD.getValue()) {
         return _servers.VINSTAAL0DISCORD;
      } else if (server.getId() == _servers.REALMGUILD.getValue()) {
         return _servers.REALMGUILD;
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
