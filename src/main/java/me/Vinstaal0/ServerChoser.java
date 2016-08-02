package me.Vinstaal0;

public class ServerChoser {
  
  public boolean isFallingKingdom(Server server) {
      if (server.getId() == "FK ID") {
          return true;
      }   else {
          return false;
      }
  }
  
  public boolean isVinstaal0Discord(Server server) {
      if (server.getId() == "VS ID") {
          return true;
      }   else {
          return false;
      }
  }
  
  public boolean isShootinHoops(Server server) {
      if (server.getId() == "SH ID") {
          return true;
      }   else {
          return false;
      }
  }

}
