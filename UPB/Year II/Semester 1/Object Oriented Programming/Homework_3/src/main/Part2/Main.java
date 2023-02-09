package main.Part2;

import main.Part2.PlayingCard.Rank;
import main.Part2.PlayingCard.Suit;

public class Main{
    public static void main(String[] args){
        Deck deck = new Deck();

        deck.addCard(new PlayingCard(Rank.ACE, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.TWO, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.THREE, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.FOUR, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.FIVE, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.SIX, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.SEVEN, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.EIGHT, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.NINE, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.TEN, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.KNIGHT, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.QUEEN, Suit.CLUBS));
        deck.addCard(new PlayingCard(Rank.KING, Suit.CLUBS));
       
        deck.addCard(new PlayingCard(Rank.ACE, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.TWO, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.THREE, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.FOUR, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.FIVE, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.SIX, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.SEVEN, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.EIGHT, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.NINE, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.TEN, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.KNIGHT, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.QUEEN, Suit.DIAMONDS));
        deck.addCard(new PlayingCard(Rank.KING, Suit.DIAMONDS));

        deck.addCard(new PlayingCard(Rank.ACE, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.TWO, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.THREE, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.FOUR, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.FIVE, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.SIX, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.SEVEN, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.EIGHT, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.NINE, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.TEN, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.KNIGHT, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.QUEEN, Suit.HEARTS));
        deck.addCard(new PlayingCard(Rank.KING, Suit.HEARTS));

        deck.addCard(new PlayingCard(Rank.ACE, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.TWO, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.THREE, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.FOUR, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.FIVE, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.SIX, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.SEVEN, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.EIGHT, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.NINE, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.TEN, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.KNIGHT, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.QUEEN, Suit.SPADES));
        deck.addCard(new PlayingCard(Rank.KING, Suit.SPADES));

        deck.shuffle();

        Deck deckPlayer1 = new Deck();
        Deck deckPlayer2 = new Deck();
        Deck deckPlayer3 = new Deck();
        Deck deckPlayer4 = new Deck();

        for(int i = 0; i < 13; i++){
            deckPlayer1.addCard(deck.removeCard());
            deckPlayer2.addCard(deck.removeCard());
            deckPlayer3.addCard(deck.removeCard());
            deckPlayer4.addCard(deck.removeCard());
        }

        Player player1 = new Player(13, deckPlayer1);
        Player player2 = new Player(13, deckPlayer2);
        Player player3 = new Player(13, deckPlayer3);
        Player player4 = new Player(13, deckPlayer4);

        do{
            PlayingCard player1Card = deckPlayer1.removeCard();
            PlayingCard player2Card = deckPlayer1.removeCard();
            PlayingCard player3Card = deckPlayer1.removeCard();
            PlayingCard player4Card = deckPlayer1.removeCard();

            

        }while(deckPlayer1 != null || deckPlayer2 != null || deckPlayer3 != null || deckPlayer4 != null);
    }
}
