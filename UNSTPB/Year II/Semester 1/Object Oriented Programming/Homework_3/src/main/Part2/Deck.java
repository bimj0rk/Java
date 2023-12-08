package main.Part2;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();

    public void addCard(PlayingCard c){
        deck.add(c);
    }

    public PlayingCard removeCard(){
        PlayingCard removedCard = deck.remove(0);
        return removedCard;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public void sort(){
        Collections.sort(deck, new Comparator<PlayingCard>(){
            public int compare(PlayingCard c1, PlayingCard c2){
                return c1.getRank().compareTo(c2.getRank());
            }
        });
            
        Collections.sort(deck, new Comparator<PlayingCard>(){
            public int compare(PlayingCard c1, PlayingCard c2){
                if(c1.getRank() == c2.getRank() && c1.getSuit() == c2.getSuit()) throw new RuntimeException("u cheatin");
                return c1.getSuit().compareTo(c2.getSuit());
            } 
        });
    }
}
