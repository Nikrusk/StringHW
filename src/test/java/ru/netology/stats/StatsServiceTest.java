package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    public void allSalesSum() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = (long) service.allSalesSum(sale);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void saleAverageMonth() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = (long) service.saleAverageMonth(sale);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void maxSale() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.maxSale(sale);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.minSales(sale);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void saleBelowAverage() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.saleBelowAverage(sale);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void saleAboveAverage() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.saleAboveAverage(sale);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
