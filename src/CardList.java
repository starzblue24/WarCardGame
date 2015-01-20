// create class CardList
import java.util.*;
public class CardList
{
  private ArrayList<Card> deck;
  private Random random=new Random();
  public CardList()
  {
    deck=new ArrayList<Card>();
  }
  public int getSize()
  {
    return deck.size();
  }
  public void addCardToBottom(Card c)
  {
    deck.add(c);
  }
  public void addCardToTop(Card c)
  {
    deck.add(0,c);
  }
  public Card takeCardFromTop()
  {
    return deck.remove(0);
  }
  public Card removeRandomCard()
  {
      return deck.remove(random.nextInt(deck.size()));
  }
  public Card getDeck(int y)
  {
    return deck.get(y);
}

}
