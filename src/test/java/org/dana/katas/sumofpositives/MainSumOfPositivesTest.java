package org.dana.katas.sumofpositives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainSumOfPositivesTest {

    @Test
    void sixPlusTenEqualsSixteen(){
        assertEquals(16, MainSumOfPositives.sumOfPositives(6, 10));
    }

    @Test
    void fivePlusFiveEqualsTen(){
        assertEquals(10, MainSumOfPositives.sumOfPositives(5, 5));
    }

    @Test
    void TwoPlusTwoEqualsFour(){
        assertEquals(4, MainSumOfPositives.sumOfPositives(2, 2));
    }
}