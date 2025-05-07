package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    public void allSalesSum() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //продажи могут быть свыше 2 млрд, целое числоЮ поэтому long в обеих случаях
        long actual = service.allSalesSum(sale); //актуальное значение может быть больше 2 млрд, целое число
        long expected = 180; //ожидаемое значение может быть больше 2 млр, целое число
        assertEquals(expected, actual);
    }

    @Test
    public void saleAverageMonth() {
        StatsService service = new StatsService();

        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //продажи могут быть свыше 2 млрд, целое числоЮ поэтому long в обеих случаях
        long actual = service.saleAverageMonth(sale); //актуальное значение может быть больше 2 млрд, целое число
        long expected = 15; //ожидаемое значение может быть больше 2 млр, целое число
        assertEquals(expected, actual);
    }

    @Test
    public void maxSale() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //продажи могут быть свыше 2 млрд, целое числоЮ поэтому long в обеих случаях
        int actual = service.maxSale(sale); // актуальное значение до 2 млрд, целое число
        int expected = 8; //ожидаемо значение до 2 млрд, целое число
        assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //продажи могут быть свыше 2 млрд, целое числоЮ поэтому long в обеих случаях
        int actual = service.minSales(sale); // актуальное значение до 2 млрд, целое число
        int expected = 9; //ожидаемо значение до 2 млрд, целое число
        assertEquals(expected, actual);
    }

    @Test
    public void saleBelowAverage() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //продажи могут быть свыше 2 млрд, целое числоЮ поэтому long в обеих случаях
        int actual = service.saleBelowAverage(sale); // актуальное значение до 2 млрд, целое число
        int expected = 5; //ожидаемо значение до 2 млрд, целое число
        assertEquals(expected, actual);
    }

    @Test
    public void saleAboveAverage() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //продажи могут быть свыше 2 млрд, целое числоЮ поэтому long в обеих случаях
        int actual = service.saleAboveAverage(sale); // актуальное значение до 2 млрд, целое число
        int expected = 5; //ожидаемо значение до 2 млрд, целое число
        assertEquals(expected, actual);
    }
}
