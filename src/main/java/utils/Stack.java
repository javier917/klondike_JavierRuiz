package utils;

public class Stack {
    public final int MAXSTACK = 40;

    protected int topIndex;

    protected Card[] data;

    public Stack() {
        this.topIndex = 0;
        this.data = new Card[MAXSTACK];
    }

    public void stack(Card card) {
        assert card != null;
        if (this.topIndex < MAXSTACK) {
            this.data[topIndex] = card;
            this.topIndex++;
        }
    }

    public boolean isEmpty() {
        return (this.topIndex == 0);
    }

    public Card getTop() {
        assert !isEmpty();
        return (this.data[topIndex - 1]);
    }

    private void unStack() {
        assert !isEmpty();
        this.topIndex--;
    }

    public Card unStackCard() {
        Card firstCard = getTop();
        unStack();
        return firstCard;
    }
}
