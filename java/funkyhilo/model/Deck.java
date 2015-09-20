package funkyhilo.model;


import funkyhilo.exception.NoMoreCardsInDeckException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anabela on 02/08/2015.
 */
public class Deck {

    private List<Card> cards = new ArrayList<Card>();

        public Deck() {
            cards = CardFactory.createCardList();
            shuffle();
        }


    public Card drawCard() throws NoMoreCardsInDeckException {

        //check if empty
        if (cards.size() > 0) {

            //we remove the topmost card
            Card card = cards.remove(0);
            //else we return the top most item
            return card;

        } else {
            //if deck is empty throw an exception
            throw new NoMoreCardsInDeckException();
        }
    }
        public static void main(String args[]){

            Deck deck = new Deck();
            Card card = null;

            try {
                 card = deck.drawCard();

            } catch (NoMoreCardsInDeckException e) {

                System.out.println(e.getMessage());
                System.out.print("Creating new deck");

                deck = new Deck();
                try{

                    card = deck.drawCard();
                }catch (NoMoreCardsInDeckException e1){
                    //ignore as I know this will work
                }
                e.printStackTrace();
            }

        }

    public void shuffle(){
        //shuffle the deck randomly
        Collections.shuffle(cards);

    }

}
