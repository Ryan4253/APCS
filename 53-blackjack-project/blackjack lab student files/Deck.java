// Class: Deck
// Purpose: This Class represents a Deck and is meant to
//          show how to write code for larger projects.
// @author TAS
// @version December 2020

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck
{
    // list of all cards in this deck
    private Card[] cards;

    // index used to track which card is on "top"
    private int currentCard;

    // constructor
    public Deck()
    {
        cards = new Card[52];
        initializeDeck();
        currentCard = 0;
    }

    // add all 52 cards to the deck and then shuffle it
    public void initializeDeck()
    {
        int idx = 0;
        
        for(String suit: Card.SUITS)
        {
            for(int i = 1; i<Card.FACES.length; i++)
            {
                cards[idx++] = new Card(suit,i);
            }
        }

        shuffle();
    }

    // get the deck's size
    public int size()
    {
        return cards.length;
    }

    // deal a card (return the top card)
    public Card dealCard()
    {
        // if this is the "last" card, then need to reset counter
        if (currentCard > 51) {
            currentCard = 0;
        }

        return cards[currentCard++];
    }

    // use Colletions.shuffle to randomly shuffle the cards
    // reset the top card 
    public void shuffle()
    {
        // reset the top card since we are shuffling
        currentCard = 0;
        
        // convert array to list so we can use the shuffle method
        List<Card> list = Arrays.asList(cards);
        Collections.shuffle(list);
        
        // convert back to array
        list.toArray(cards);
    }

    public String toString()
    {
        return "currentCard="+ currentCard + ", cards:" + Arrays.toString(cards);
    }
}