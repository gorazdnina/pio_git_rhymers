package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    protected int[] numbers = new int[tabSize];
    protected static final int tabSize = 12;

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[total = getTotal() + 1] = in;
    }

    public boolean callCheck() {
        return getTotal() == -1;
    }

    public boolean isFull() {
        return getTotal() == tabSize-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total = getTotal() - 1];
    }

    public int getTotal() {
        return total;
    }
}
