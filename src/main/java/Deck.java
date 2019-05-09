import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public int cardCount(){
        return cards.size();
    }

    public void populateCards() {
        for (SuitType suit : SuitType.values()){
           for (RankType rank : RankType.values()){
               Card card = new Card(suit, rank);
               this.cards.add(card);
           }
        }
    }

    public Card dealCard() {
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
