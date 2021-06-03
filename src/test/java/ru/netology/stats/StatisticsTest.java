package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    @Test
    void ShouldSumCalculate() {
        Statistics service = new Statistics();
        long[] initialValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.ShouldSumCalculate(initialValue);
        assertEquals(expected, actual);

    }

    @Test
    void MiddleValueCalculate() {
        Statistics service = new Statistics();
        long[] initialValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.MiddleValueCalculate(initialValue);
        assertEquals(expected, actual);

    }

    @Test
    void minSalesCalculate() {
        Statistics service = new Statistics();
        long[] initialValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSalesCalculate(initialValue);
        assertEquals(expected, actual);
    }

    @Test
    void maxSalesCalculate() {
        Statistics service = new Statistics();
        long[] initialValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSalesCalculate(initialValue);
        assertEquals(actual, expected);
    }

    @Test
    void middleValueMinSalesCalculate() {
        Statistics service = new Statistics();
        long summMethod = MiddleValueCalculate;
        long[] initialValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.middleValueMinSalesCalculate(initialValue);
        assertEquals(expected, actual);
    }

    @Test
    void middleValueMaxSalesCalculate() {
        Statistics service = new Statistics();
        long[] initialValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.middleValueMaxSalesCalculate(initialValue);
        assertEquals(expected, actual);
    }


}