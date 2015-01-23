public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    CardList HandA = new CardList();
    CardDeck Deck = new CardDeck();
    CardList HandB = new CardList();
    CardList StackA = new CardList();
    CardList StackB = new CardList();
    Deck.Shuffle();
    // deal the cards 
    int cardsInDeck = Deck.getSize();
    for(int count=1; count<=cardsInDeck/2; count++)
    {
      HandA.addCardToBottom(Deck.takeCardFromTop());
      HandB.addCardToBottom(Deck.takeCardFromTop());
    }
    // play
    System.out.println("A---player---B");
    int r=1; //round number
    while(HandA.getSize()>0 && HandB.getSize()>0)
    {
      System.out.println(HandA.getSize()+" --- round "+r+" --- "+HandB.getSize()); 
      r++;
      StackA.addCardToTop(HandA.takeCardFromTop());
      StackB.addCardToTop(HandB.takeCardFromTop());
      System.out.println("     "+StackA.getCard(0)+" : "+StackB.getCard(0)+"     "); 
      while(StackA.getCard(0).compareTo(StackB.getCard(0))==0 && HandA.getSize()>3 && HandB.getSize()>3)
      {//deals with war 
        System.out.println(HandA.getSize()+" --- THIS IS WAR --- "+HandB.getSize());
        for (int suit=1; suit<=4; suit++)
        {//adds cards to stack         
          StackA.addCardToTop(HandA.takeCardFromTop());
          StackB.addCardToTop(HandB.takeCardFromTop());
        }
      }//player winner of war
      if(StackA.getCard(0).compareTo(StackB.getCard(0))>0)
      {
        int stackAsize= StackA.getSize();
        for(int i=0; i<stackAsize; i++)
        {
          HandA.addCardToBottom(StackA.takeCardFromTop());
          HandA.addCardToBottom(StackB.takeCardFromTop());
        }
      }
      else 
      {
        int StackAsize=StackA.getSize();
        for(int i=0; i<StackAsize; i++)
        {          
          HandB.addCardToBottom(StackA.takeCardFromTop());
          HandB.addCardToBottom(StackB.takeCardFromTop());
        }
      }
    }
    
  }
}

