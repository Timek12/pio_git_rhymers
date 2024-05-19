package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_STACK_VALUE = -1;
    private static final int STACK_CAPACITY = 12;
    private final int[] numbers = new int[STACK_CAPACITY];

    private int totalCount = EMPTY_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return totalCount == STACK_CAPACITY + EMPTY_STACK_VALUE;
    }

    protected int peekLast() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[totalCount--];
    }

    public int getTotalCount() {
        return totalCount;
    }
}
