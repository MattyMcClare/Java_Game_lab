public class Player {

    private Card card;

    public Player(){
        this.card = null;
    }

    public void addCardToHand(Card card) {
        this.card = card;
    }

    public void removeCard() {
        this.card = null;
    }

    public boolean hasCard() {
        return !(card  == null);
    }

    public int getCardValue() {
        return card.getValueFromEnum();
    }
}
