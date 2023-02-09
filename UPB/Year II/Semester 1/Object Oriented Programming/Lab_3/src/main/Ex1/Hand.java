package main.Ex1;

import java.io.*;
import java.util.*;
import main.Storable;

public class Hand implements Storable{

    ArrayList<Card> cards = new ArrayList<Card>();

    public void addCard(Card c){
        cards.add(c);
    }

    public void deleteCard(Card.Rank r, Card.Suit s){
        Card cTemp = null;
        for(Card c : cards){
            if(c.getRank() == r && c.getSuit() == s) cTemp = c;
            if(cTemp != null) cards.remove(cTemp);
        }
    }

    public void display(){
        for(Card c : cards) System.out.println(c.getRank() + " of " + c.getSuit());
    }

    public void sort(){
        Collections.sort(cards, new Comparator<Card>(){
            public int compare(Card c1, Card c2){
                return c1.getRank().compareTo(c2.getRank());
            }
        });
        
        Collections.sort(cards, new Comparator<Card>(){
            public int compare(Card c1, Card c2){
                if(c1.getRank() == c2.getRank() && c1.getSuit() == c2.getSuit()) throw new RuntimeException("u cheatin");
                return c1.getSuit().compareTo(c2.getSuit());
            } 
        });
    }
    
    public void store(String file) throws FileNotFoundException{
        FileOutputStream outputFile = new FileOutputStream ("hand.txt");
        OutputStreamWriter outputStream = new OutputStreamWriter(outputFile);
        PrintWriter pw = new PrintWriter(outputStream);
        pw.println("The hand in order:");
        for(Card c : cards){
            pw.println(c.getRank() + " of " + c.getSuit());
        }
        pw.close();
    }
}
