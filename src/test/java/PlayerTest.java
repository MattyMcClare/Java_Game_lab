import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player();
        card = new Card(SuitType.SPADES, RankType.JACK);
    }

    @Test
    public void startsWithNoCard(){
        assertEquals(false, player.hasCard());
    }

    @Test
    public void canAddCardToHand(){
        player.addCardToHand(card);
        assertEquals(true, player.hasCard());
        assertEquals(10, player.getCardValue());
    }

    @Test
    public void canRemoveCardFromHand(){
        player.addCardToHand(card);
        player.removeCard();
        assertEquals(false, player.hasCard());
    }
}
