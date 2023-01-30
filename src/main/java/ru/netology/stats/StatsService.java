package ru.netology.stats;

public class StatsService {

    public long totalOfAllSales(long[] sales) {

        long totalSales = 0;
        for (long arrSales : sales) {
            totalSales += arrSales;
        }
        return totalSales;
    }

    public long averageSalesAmount(long[] sales) {
        return totalOfAllSales(sales) / sales.length;
    }

    public int maximumSalesMonth(long[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minimumSalesMonth(long[] sales) {

        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        long average = averageSalesAmount(sales);
        int monthBelowAverage = 0;
        for (long belowAverage : sales) {
            if (belowAverage < average) {
                monthBelowAverage++;
            }
        }
        return monthBelowAverage;
    }

    public int salesAreAboveAverage(long[] sales) {
        long average = averageSalesAmount(sales);
        int monthAboveAverage = 0;
        for (long aboveAverage : sales) {
            if (aboveAverage > average) {
                monthAboveAverage++;
            }
        }
        return monthAboveAverage;
    }

}
