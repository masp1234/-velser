public class Card {
    private String suit;
    private int value;


    public boolean beats(Card card) {
        return this.value > card.value;
    }
}
