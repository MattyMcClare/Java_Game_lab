import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void deckCanGetCards(){
        deck.populateCards();
        assertEquals(52, deck.cardCount() );
    }
    @Test
    public void canDealCard(){
        deck.populateCards();
        Card card = deck.dealCard();
        assertEquals(51, deck.cardCount());
        assertEquals(2, card.getValueFromEnum());
    }


    @Test
    public void deckCanShuffle(){
        deck.populateCards();
        deck.shuffle();
        Card card = new Card(SuitType.SPADES, RankType.TWO);
        assertNotEquals(card, deck.dealCard());
    }

}
