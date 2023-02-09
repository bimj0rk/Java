package main.Ex1;
import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args) throws FileNotFoundException{
        
        Hand h = new Hand();

        //adding cards
        h.addCard(new Card(Card.Rank.ACE, Card.Suit.DIAMONDS));
        h.addCard(new Card(Card.Rank.KING, Card.Suit.CLUBS));
        h.addCard(new Card(Card.Rank.QUEEN, Card.Suit.HEARTS));
        h.addCard(new Card(Card.Rank.TEN, Card.Suit.DIAMONDS));
        h.addCard(new Card(Card.Rank.FIVE, Card.Suit.SPADES));

        //display current sorting
        h.display();

        //delete a card
        h.deleteCard(Card.Rank.QUEEN, Card.Suit.HEARTS);

        //sort cards
        h.sort();

        //display new sorting
        h.display();

        //write to file
        h.store("hand.txt");        
    }    
}
