package main.Ex1;

public class Card{
    public enum Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNIGHT, QUEEN, KING;
    }
    
    public enum Suit{
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }

    private Rank rank;
    private Suit suit;

    public Card(Rank r, Suit s){
        setRank(r);
        setSuit(s);
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
