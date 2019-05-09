import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Player player;
    Player player1;

    Card card;
    Card card1;

    @Before
    public void before(){
        game = new Game();
        player = new Player();
        player1 = new Player();

        card = new Card(SuitType.DIAMONDS, RankType.JACK);
        card1 = new Card(SuitType.DIAMONDS, RankType.FOUR);
    }


    @Test
    public void hasDeck(){
        game.getCards();
        assertEquals(52, game.getDeck().cardCount());
    }

    @Test
    public void startsWithNoPlayers(){
        assertEquals(0, game.playerCount());
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player);
        assertEquals(1, game.playerCount());
    }

    @Test
    public void canDetermineWinner(){
        player.addCardToHand(card);
        player1.addCardToHand(card1);
        game.addPlayer(player);
        game.addPlayer(player1);
        assertNull(game.getWinner());
        game.determineWinner();
        assertEquals(player, game.getWinner());
    }

    @Test
    public void canPlayAGame(){
        game.addPlayer(player);
        game.addPlayer(player1);
        game.playGame();
        assertNotNull(game.getWinner());
    }

}
