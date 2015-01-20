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
    Card k;
    Card s;
    for(int count=1; count<=Deck.getSize(); count++)
    {
      k=Deck.takeCardFromTop();
      HandA.addCardToBottom(k);
      s=Deck.takeCardFromTop();
      HandB.addCardToBottom(s);
    }
    // play
    System.out.println("A---player---B");
    int r=1; //round number
    while(HandA.getSize()>0 && HandB.getSize()>0)
    {
      System.out.println(HandA.getSize()+" --- round "+r+" --- "+HandB.getSize()); 
      r++;
       System.out.println("     "+StackA.toString()+" : "+StackB.toString()+"     "); 
    StackA.addCardToTop(HandA.takeCardFromTop());
    StackB.addCardToTop(HandB.takeCardFromTop());
      while(StackA.getDeck(0).compareTo(StackB.getDeck(0))==0)
      {
        System.out.println(HandA.getSize()+" --- THIS IS WAR --- "+HandB.getSize());
        for (int suit=1; suit<=4; suit++)
        {
          Card h=HandA.getDeck(0);
          HandA.takeCardFromTop();
          StackA.addCardToTop(h);
        }
        for (int suit=1; suit<=4; suit++)
        {
          Card h=HandB.getDeck(0);
          HandB.takeCardFromTop();
          StackB.addCardToTop(h);
        }
        if(StackA.getDeck(0).compareTo(StackB.getDeck(0))>0)
        {
          for(int i=0; i<StackA.getSize(); i++)
          {
            HandA.addCardToBottom(StackA.getDeck(i));
          }
        }
        else if(StackA.getDeck(0).compareTo(StackB.getDeck(0))<0)
        {
          for(int i=0; i<StackA.getSize(); i++)
          {
            HandB.addCardToBottom(StackB.getDeck(i));
          }
        }
        
      }
      if(StackA.getDeck(0).compareTo(StackB.getDeck(0))>0)
      {
      HandB.addCardToBottom(StackA.takeCardFromTop());
      HandB.addCardToBottom(StackB.takeCardFromTop());
      }
      else
      {
      HandA.addCardToBottom(StackA.takeCardFromTop());
      HandA.addCardToBottom(StackB.takeCardFromTop());
      }
    }
    
  }
}


