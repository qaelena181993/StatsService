package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int monthSale : sales) {
            sum = sum + monthSale;
        }
        return sum;
    }

    public int calculateFindAverage(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int monthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthBelAvg(int[] sales) {
        int month = 0;
        int average = calculateFindAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int monthAbovAvg(int[] sales) {
        int month = 0;
        int average = calculateFindAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}
