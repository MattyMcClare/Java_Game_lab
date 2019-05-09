import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){

        card = new Card(SuitType.HEARTS, RankType.TWO);

    }

    @Test
    public void canGetSuit(){

        assertEquals(SuitType.HEARTS ,card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.TWO, card.getRank());
    }

    @Test
    public void queenHasValue12(){
        Card card = new Card(SuitType.DIAMONDS, RankType.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }
}