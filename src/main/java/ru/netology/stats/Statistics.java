package ru.netology.stats;

public class Statistics {

    public long shouldSum(long[] salesValue) { //(1)
        long newValue = 0;
        for (long startValue : salesValue) {
            newValue += startValue;
        }
        return newValue;
    }

    public long middleValue(long[] salesValue) { //(2)
        long month = salesValue.length;
        long averageValue = shouldSum(salesValue);
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
        long monthAverageValue = middleValue(salesValue);
        long middleMonth = 0;
        for (long costMonth : salesValue) {
            if (costMonth < monthAverageValue) {
                middleMonth = middleMonth + 1;
            }
        }
        return middleMonth;
    }

    public long middleValueMaxSales(long[] salesValue) { //(6)
        long averageValue = middleValue(salesValue);
        long middleMonth = 0;
        for (long costMonth : salesValue) {
            if (costMonth > averageValue) {
                middleMonth = middleMonth + 1;
            }
        }
        return middleMonth;
    }
}