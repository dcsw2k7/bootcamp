package deck;

public enum Suit {  // 牌花款
  DIAMOND(1),
  CLUB(2),
  HEART(3),
  SPADE(4),
  ;
  
  private int rank;



  public int getRank() {
    return this.rank;
  }


  /* 重要 */
  // most of the instance methods should refer to "this"
  // if there is no "this" keyword in your method, then probably you should
  // consider to use "Static method"
  public boolean isHigherThan(Suit suit) {
    return this.rank >= suit.getRank();  
    /* this.rank 是否大於 suit.getRank(), 如是 */
  }

public static void main(String[] args) {
  // why do we have isHighterThan() ?
  Suit currentSuit = Suit.CLUB;
  Suit targetSuit = Suit.DIAMOND;

  // Meaning: comparing their ranking /* 比較兩者排名 */
  if (currentSuit.getRank() > targetSuit.getRank()) {
    /* currendSuit.getRank 大過 targetSuit.getRank */ 
      
    }
    
    if (currentSuit.isHigherThan(targetSuit)) {
    /* currendSuit.isHighterThan(targetSuit) ????? */ 

  }




}





}
