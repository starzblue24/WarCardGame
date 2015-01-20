// create class CardDeck that extends CardList
public class CardDeck extends CardList 
{
  private int suits=4;
  private int ranks=13;
  private int swaps=10000;
  public CardDeck()
  {
    super();
    Card temp;
    for(int s=1; s<=4; s++)
    {
      for(int r=1; r<=13;r++)
      {
        temp=new Card(s,r);
        this.addCardToBottom(temp);
      }
    }
  }
  public void Shuffle()
  {
    Card c;
    for(int s=0; s<swaps; s++)
    {
     for(int x=0; x<10000; x++)
     {
      c=new Card(suits, ranks);
       this.addCardToBottom(c);
     }
    }
  }
}
  
