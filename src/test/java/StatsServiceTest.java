import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

   @org.junit.jupiter.api.Test
    void shouldCalculateMinSalesMonth() {
       StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        // вызываем целевой метод:
        long actual = service.minSalesMonth(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        // вызываем целевой метод:
        long actual = service.maxSalesMonth(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        // вызываем целевой метод:
        long actual = service.totalSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        // вызываем целевой метод:
        double actual = service.averageSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateCountMonthBelowAverage() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        // вызываем целевой метод:
        long actual = service.countMonthBelowAverage(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateCountMonthAboveAverage() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        // вызываем целевой метод:
        long actual = service.countMonthAboveAverage(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }




}