package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int emptyStackValue = -1;
    public static final int stackCapacity = 11;
    private int[] numbers = new int[12];

    public int totalCount = emptyStackValue;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == emptyStackValue;
    }

    public boolean isFull() {
        return totalCount == stackCapacity;
    }

    protected int peekLast() {
        if (callCheck())
            return emptyStackValue;
        return numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return emptyStackValue;
        return numbers[totalCount--];
    }

}
