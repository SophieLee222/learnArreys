package ru.netology.learnArreys.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSum(){
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedSum = 180;
        long actualSum = service.calculateSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalculateAverage(){
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedSum = 15;
        double actualSum = service.calculateAverage(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldSelectMaxMonth(){
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldSelectMinMonth(){
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldCountMonthsBelowAverage(){
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedNumberBelowAverage = 5;
        int actualNumberBelowAverage = service.countMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedNumberBelowAverage, actualNumberBelowAverage);
    }

    @Test
    public void shouldCountMonthsAboveAverage(){
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedNumberAboveAverage = 5;
        int actualNumberAboveAverage = service.countMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedNumberAboveAverage, actualNumberAboveAverage);
    }
}
