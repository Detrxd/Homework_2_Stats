package ru.netology.stats;

public class Statistics {
    public long ShouldSumCalculate(long[] initialValue) {
        long newValue = 0;
        for (long startValue : initialValue) {
            newValue += startValue;
        }
        return newValue;
    }

    public long MiddleValueCalculate(long[] initialValue) {
        long averageValue = 0;
        for (long newAverageValue : initialValue) {
            averageValue += newAverageValue;
        }
        long month = initialValue.length;
        long monthAverageValue = averageValue / month;
        return monthAverageValue;
    }

    public long maxSalesCalculate(long[] initialValue) {
        long maxMonth = 0;
        long month = 0;
        for (long sales : initialValue) {
            if (sales >= initialValue[(int) maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSalesCalculate(long[] initialValue) {
        long minMonth = 0;
        long month = 0;
        for (long sale : initialValue) {
            if (sale <= initialValue[(int) minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long middleValueMinSalesCalculate(long[] initialValue) {
        long averageValue = 0;
        long middleMonth = 0;
        for (long newAverageValue : initialValue) {
            averageValue += newAverageValue;
        }
        long month = initialValue.length;
        long monthAverageValue = averageValue / month;
        for (long costMonth : initialValue) {
            if (costMonth < monthAverageValue) {
                middleMonth = middleMonth + 1;
            }
            middleMonth = middleMonth;
        }
        return middleMonth;
    }

    public long middleValueMaxSalesCalculate(long[] initialValue) {
        long averageValue = 0;
        long middleMonth = 0;
        for (long newAverageValue : initialValue) {
            averageValue += newAverageValue;
        }
        long month = initialValue.length;
        long monthAverageValue = averageValue / month;
        for (long costMonth : initialValue) {
            if (costMonth > monthAverageValue) {
                middleMonth = middleMonth + 1;
            }
            middleMonth = middleMonth;
        }
        return middleMonth;
    }
}
