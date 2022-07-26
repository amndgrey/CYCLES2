package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class StatsServiceTest {
    StatsService service = new StatsService();
    int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldSum() {

        int actual = service.sum(profits);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAvarageSum() {

        int actual = service.avarageSum(profits);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() {

        int actual = service.maxSales(profits);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() {

        int actual = service.minSales(profits);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"15,5"})
    public void shouldMinCountMonth(int averageSum, int expected) {

        int actual = service.minCountMonth(profits, averageSum);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"15,5"})
    public void shouldMaxCountMonth(int averageSum, int expected) {

        int actual = service.maxCountMonth(profits, averageSum);

        Assertions.assertEquals(expected, actual);
    }
}
