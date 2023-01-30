package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService statsService = new StatsService();
    long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 17, 14, 14, 18};

    @Test
    public void shouldTotalOfAllSales() {

        int expected = 190;
        Assertions.assertEquals(expected, statsService.totalOfAllSales(monthSales));
    }

    @Test
    public void shouldAverageSalesAmount() {

        int expected = 15;
        Assertions.assertEquals(expected, statsService.averageSalesAmount(monthSales));
    }

    @Test
    public void shouldReturnMaximumSalesMonth() {

        int expected = 8;
        Assertions.assertEquals(expected, statsService.maximumSalesMonth(monthSales));
    }

    @Test
    public void shouldReturnMinimumSalesMonth() {

        int expected = 1;
        Assertions.assertEquals(expected, statsService.minimumSalesMonth(monthSales));
    }

    @Test
    public void shouldReturnSalesBelowAverage() {

        int expected = 4;
        Assertions.assertEquals(expected, statsService.salesBelowAverage(monthSales));
    }

    @Test
    public void shouldReturnSalesAreAboveAverage() {

        int expected = 6;
        Assertions.assertEquals(expected, statsService.salesAreAboveAverage(monthSales));
    }

}
