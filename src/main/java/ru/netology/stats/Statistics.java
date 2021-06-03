package ru.netology.stats;

public class Statistics {

    public long ShouldSum(long[] salesValue) { //(1)
        long newValue = 0;
        for (long startValue : salesValue) {
            newValue += startValue;
        }
        return newValue;
    }

    public long MiddleValue(long[] salesValue) { //(2)
        long averageValue = 0;
        for (long newAverageValue : salesValue) {
            averageValue += newAverageValue;
        }
        long month = salesValue.length;
        long monthAverageValue = averageValue / month;
        return monthAverageValue;
    }

    public int maxSales(long[] salesValue) { //(3)
        int maxMonth = 0;
        int month = 0;
        for (long sales : salesValue) {
            if (sales >= salesValue[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] salesValue) { //(4)
        int minMonth = 0;
        int month = 0;
        for (long sale : salesValue) {
            if (sale <= salesValue[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long middleValueMinSales(long[] salesValue) { //(5)
        long monthAverageValue = MiddleValue(salesValue);
        long middleMonth = 0;
        for (long costMonth : salesValue) {
            if (costMonth < monthAverageValue) {
                middleMonth = middleMonth + 1;
            }
        }
        return middleMonth;
    }

    public long middleValueMaxSales(long[] salesValue) { //(6)
        long averageValue = MiddleValue(salesValue);
        long middleMonth = 0;
        for (long costMonth : salesValue) {
            if (costMonth > averageValue) {
                middleMonth = middleMonth + 1;
            }
        }
        return middleMonth;
    }
}