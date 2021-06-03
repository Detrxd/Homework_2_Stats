package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    @Test
    void ShouldSum() { //(1)
        Statistics service = new Statistics();
        long[] salesValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.ShouldSum(salesValue);
        assertEquals(expected, actual);

    }

    @Test
    void MiddleValue() { //(2)
        Statistics service = new Statistics();
        long[] salesValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.MiddleValue(salesValue);
        assertEquals(expected, actual);

    }

    @Test
    void maxSales() { //(3)
        Statistics service = new Statistics();
        long[] salesValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(salesValue);
        assertEquals(expected, actual);
    }

    @Test
    void minSales() { //(4)
        Statistics service = new Statistics();
        long[] salesValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(salesValue);
        assertEquals(actual, expected);
    }

    @Test
    void middleValueMinSales() { //(5)
        Statistics service = new Statistics();
        long[] salesValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.middleValueMinSales(salesValue);
        assertEquals(expected, actual);
    }

    @Test
    void middleValueMaxSales() { //(6)
        Statistics service = new Statistics();
        long[] salesValue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.middleValueMaxSales(salesValue);
        assertEquals(expected, actual);
    }
}