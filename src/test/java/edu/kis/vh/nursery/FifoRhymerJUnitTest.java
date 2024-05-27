package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FifoRhymerJUnitTest {

    @Test
    public void testCountOut() {
        FifoRhymer fifoRhymer = new FifoRhymer();
        int testValue = 4;
        fifoRhymer.countIn(testValue);
        Assert.assertEquals(testValue, fifoRhymer.countOut());
    }

    @Test
    public void testCountOutWithMultipleValues() {
        FifoRhymer fifoRhymer = new FifoRhymer();

        int[] testValues = {1, 2, 3, 4, 5};
        for (int value : testValues) {
            fifoRhymer.countIn(value);
        }
        for (int value : testValues) {
            Assert.assertEquals(value, fifoRhymer.countOut());
        }
    }

    @Test
    public void testCountOutWithEmpty() {
        FifoRhymer fifoRhymer = new FifoRhymer();

        Assert.assertEquals(-1, fifoRhymer.countOut());
    }
}