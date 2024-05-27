package edu.kis.vh.nursery;

/**
 * FifoRhymer is a class that extends DefaultCountingOutRhymer class
 * It has DefaultCountingOutRhymer attribute
 * It overrides the countOut method to provide a FIFO functionality
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Overrides the countOut method from DefaultCountingOutRhymer.
     * It provides a FIFO behavior by using a temporary DefaultCountingOutRhymer.
     *
     * @return the first integer that was counted in.
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        final int countOut = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return countOut;
    }
}
