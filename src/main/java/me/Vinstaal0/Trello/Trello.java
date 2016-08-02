package me.Vinstaal0.Trello;

public class Trello {
  
  Trello trelloApi = new TrelloImpl(trellokey, trelloaccestoken);
  
  Board board = trelloApi.getBoard(trelloBoardForAddingCardsId);
  List<TList> lists = board.fetchLists();

}
