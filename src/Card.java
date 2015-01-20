// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard
{
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  public String toString()
  {
    String r="";
    if(getSuit()==1)
    {
      if(this.getRank()==10)
      {
        r= "H-T";
      }
      if(this.getRank()==11)
      {
        r= "H-J";
      }
      if(this.getRank()==12)
      {
        r= "H-Q";
      }
      if(this.getRank()==13)
      {
        r= "H-K";
      }
      if(this.getRank()==1)  
      {
        r="H-A";
      }
      else{
        r= "H"+this.getRank();
      }
    }
    if(this.getSuit()==2)
    {
      if(this.getRank()==10)
      {
        r= "C-T";
      }
      if(this.getRank()==11)
      {
        r= "C-J";
      }
      if(this.getRank()==12)
      {
        r= "C-Q";
      }
      if(this.getRank()==13)
      {
        r= "C-K";
      }
      if(this.getRank()==1)  
      {
        r="C-A";
      }
      else{
        r="C"+this.getRank();
      }
    }
    if(this.getSuit()==3)
    {
      if(this.getRank()==10)
      {
        r="D-T";
      }
      if(this.getRank()==11)
      {
        r="D-J";
      }
      if(this.getRank()==12)
      {
        r="D-Q";
      }
      if(this.getRank()==13)
      {
        r="D-K";
      }
      if(this.getRank()==1)  
      {
        r="D-A";
      }
      else{
        r="D"+this.getRank();
      }
    }
    if(this.getSuit()==4)
    {
      if(this.getRank()==10)
      {
        r="S-T";
      }
      if(this.getRank()==11)
      {
        r="S-J";
      }
      if(this.getRank()==12)
      {
        r="S-Q";
      }
      if(this.getRank()==13)
      {
        r="S-K";
      }
      if(this.getRank()==1)  
      {
        r="S-A";
      }
      else{
        r="S"+this.getRank();
      }
    }
    return r;
  }
  
  public int compareTo(Card x)
  {
    return this.getRank()-x.getRank();
  }
}
