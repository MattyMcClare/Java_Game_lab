import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private Player winner;

    public Game(){
        this.deck = new Deck();
        this.players = new ArrayList<>();
        this.winner = null;
    }

    public void getCards() {
        this.deck.populateCards();
    }

    public Deck getDeck() {
        return deck;
    }

    public int playerCount() {
        return players.size();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player determineWinner() {
        Player winningPlayer = players.get(0);
        for (Player player: players){
            if(player.getCardValue() > winningPlayer.getCardValue()){
                winningPlayer = player;
            }
        }
        this.winner = winningPlayer;
        return winningPlayer;
    }


    public Player getWinner() {
        return winner;
    }

    public void playGame() {
        getCards();
        deck.shuffle();

        for(Player player : players){
            player.addCardToHand(deck.dealCard());
        }
        determineWinner();
    }
}
