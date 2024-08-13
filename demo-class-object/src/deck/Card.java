package deck;

public class Card {

  // private String Suit;
  // private String rank;
  /* Card 由 suit,rank 組成 */
  private Suit suit;
  private Rank rank;

  // public Card(String Suit , String rank)
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }
  
  /* 建立可取得方法 get */
  // public String getSuit() {
  public Suit getSuit() {
    return this.suit;
  }

  // public String getRank() {
  public Rank getRank() {
    return this.rank;
  }

  // Codeing Style: Early Return
  public boolean isHigherThan(Card card) {  // when the method is defined small enough 設定方法(method)應該盡量描述較仔細
    // compare rank first, if they are equl , then compare suit.

    /* if .. return 比用 if else if 安全 */
    // "OR" relationship
    if (this.rank.isHigherThan(card.getRank()))
      return true;  // exit method!!!
    if (this.rank == card.getRank() && this.suit.isHigherThan(card.getSuit()))
      return true;
    return false;  // base condition ("most likely" fall into ) 
  }

  
  @Override
  public String toString() {
    return "Card("
    + "suit=" + this.suit
    + ", rank=" + this.rank
    + ")";
  }
  
    
  public static void main(String[] args) {
    //Deck deck = new Deck();
    //Card[] cards = deck.getCards(); 


    int x = 2;
    if (x > 3) { // = 3

    } else if (x > 4 || x > 4 && x < 10) {

    }

    System.out.println(new Card(Suit.CLUB, Rank.NINE));
    System.out.println(new Card(Suit.CLUB, Rank.NINE)
      .isHigherThan(new Card(Suit.DIAMOND, Rank.JACK)));  // 


      
  }










}
