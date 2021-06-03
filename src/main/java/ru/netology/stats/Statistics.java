package ru.netology.stats;

public class Statistics {
    private Object MiddleValueCalculate;

    public long ShouldSumCalculate(long[] salesValue) { //(1)
        long newValue = 0;
        for (long startValue : salesValue) {
            newValue += startValue;
        }
        return newValue;
    }

    public long MiddleValueCalculate(long[] salesValue) { //(2)
        long averageValue = 0;
        for (long newAverageValue : salesValue) {
            averageValue += newAverageValue;
        }
        long month = salesValue.length;
        long monthAverageValue = averageValue / month;
        return monthAverageValue;
    }

    public long maxSalesCalculate(long[] salesValue) { //(3)
        long maxMonth = 0;
        long month = 0;
        for (long sales : salesValue) {
            if (sales >= maxMonth) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSalesCalculate(long[] salesValue) { //(4)
        long minMonth = 0;
        long month = 0;
        for (long sale : salesValue) {
            if (sale <= minMonth) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long middleValueMinSalesCalculate(long[] salesValue) { //(5)
//        long averageValue = 0;
//        long middleMonth = 0;
////        for (long newAverageValue : initialValue) {
////            averageValue += newAverageValue;
////        }
//        long month = salesValue.length;
//        long monthAverageValue = averageValue / month;
//        long summMethod = MiddleValueCalculate;
//        for (summMethod :salesValue) {
//            if (summMethod < monthAverageValue) {
//                middleMonth = middleMonth + 1;
//            }
//            middleMonth = middleMonth;
//        }
//        return middleMonth;
    }

    public long middleValueMaxSalesCalculate(long[] initialValue) { //(6)
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

    private class MiddleValueCalculate {
    }
}
