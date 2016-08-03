package me.Vinstaal0;

public class ServerChoser {
  
  public enum _Server {
     FALLINGKINGDOM("131434184857092096"),
     VINSTAAL0DISCORD("109272327514005504"),
     REALMGUILD("209719487572738049")
    
     private String id;
    
     private _Server(String id) {
          this.id = id;
       }
       
     public String getId() {
         return this.id;
      }
     
  }
  
  public _Server getServerName(Server server) {
      
      if (server.getId() == _Server.FALLINGKINGDOM.getId()) {
         return _Server.FALLINGKINGDOM;
      } else if (server.getId() == _Server.VINSTAAL0DISCORD.getId()) {
         return _Server.VINSTAAL0DISCORD;
      } else if (server.getId() == _Server.REALMGUILD.getId()) {
         return _Server.REALMGUILD;
      } else {
         return null;
      }
    
  };
  
  public boolean isFallingKingdom(Server server) {
      if (server.getId() == _Server.FALLINGKINGDOM.getId()) {
          return true;
      }   else {
          return false;
      }
  }
  
  public boolean isVinstaal0Discord(Server server) {
      if (server.getId() == _Server.VINSTAAL0DISCORD.getId()) {
          return true;
      }   else {
          return false;
      }
  }
  
  public boolean isRealmGuild(Server server) {
      if (server.getId() == _Server.REALMGUILD.getId()) {
          return true;
      }   else {
          return false;
      }
  }

}
