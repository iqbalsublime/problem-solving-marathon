package org.jugbd.marathon.day1;

import org.junit.Test;

import static org.junit.Assert.*;


public class BiggestNumberTest {

    @Test
    public void basicTests() {
        assertEquals(21, BiggestNumber.findTheNextBiggerNumber(12));
        assertEquals(531, BiggestNumber.findTheNextBiggerNumber(513));
        assertEquals(2071, BiggestNumber.findTheNextBiggerNumber(2017));
        assertEquals(441, BiggestNumber.findTheNextBiggerNumber(414));
        assertEquals(414, BiggestNumber.findTheNextBiggerNumber(144));
        assertEquals(-1, BiggestNumber.findTheNextBiggerNumber(111));
        assertEquals(-1, BiggestNumber.findTheNextBiggerNumber(531));
    }
}