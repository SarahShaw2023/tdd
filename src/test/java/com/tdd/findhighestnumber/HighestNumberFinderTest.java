package com.tdd.findhighestnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestNumberFinderTest {
    //Format: Ary amount + result
    @Test
    public void singleItemIsHighest () {
        //arrange
        int ary[] = {10};
        HighestNumberFinder f = new HighestNumberFinder();

        int expectedResult = 10;

        //act
        int actualResult = f.findHighestNumber(ary);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void firstItemInDoubleAryIsHighest () {
        //arrange
        int ary[] = {13, 4};
        HighestNumberFinder f = new HighestNumberFinder();

        int expectedResult = 13;

        //act
        int actualResult = f.findHighestNumber(ary);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void secondItemInDoubleAryIsHighest () {
        //arrange
        int ary[] = {7, 13};
        HighestNumberFinder f = new HighestNumberFinder();

        int expectedResult = 13;

        //act
        int actualResult = f.findHighestNumber(ary);

        //assert
        assertEquals(expectedResult, actualResult);
    }

}


