package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(monthSale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateFindAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthBelAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthBelAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldmonthAbovAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthAbovAvg(sales);

        assertEquals(expected, actual);
    }

}