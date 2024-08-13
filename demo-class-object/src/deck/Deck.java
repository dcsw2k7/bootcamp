package deck;

import java.util.Arrays;

public class Deck {
    // public static final String[] suits =
    //   new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};
    // public static final String[] ranks = 
    //   new String[] {"ACE", "TWO", "THREE", "FOUR",
    //     "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"}; 

    // Player, Deck, Card, 

  //   public static int length = suits.length * ranks.length;
  public static int length = Suit.values().length * Rank.values().length;

  private Card[] cards;

  public Deck() {
   this.cards = new Card[length];   // [suits.length * ranks.length];
    int idx = 0;
    for (Suit suit : Suit.values()) {  // String suit : suits)
     for (Rank rank :Rank.values()) {  // String rank : ranks
        this.cards[idx++] = new Card(suit, rank);
     }
    }
  }

  public static void test() {
    System.out.println("hello");
    Deck d = new Deck();
    d.getCards();
  }

  public Card[] getCards() {
    return this.cards;
  }

  // public void shuffle() {
  //  if (times > )
  //
  //  int idx = new Random().nextInt(length);  // 0 - 51
  //  Card[] cards = new Card[length];
  //  int count = 0;
  //  for (int i = idx; i < length; i++) {
  //   cards[count++] = this.cards[j];
  //  }
  //  for (int j = 0; j < idx; j++) {
  //   cards[count++] = this.cards[j];
  //  }
  // }

  // this.cards = newCards;

  
  public void shuffle(int times) {
    ShuffleManager sm = new ShuffleManager(getCards());
    sm.shuffle(times);
    this.cards = sm.getCards();
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle(100);
    
    System.out.println("Card[] after shuffle():");
    for (Card card : deck.getCards()) {
      System.out.println(card);
    }

    Deck.test();

  }
}