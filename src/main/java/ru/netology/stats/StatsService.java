package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long totalAmount = 0;
        for (long sale : sales) {
            totalAmount = totalAmount + sale;
        }
        return totalAmount;
    }

    public double averageSales(long[] sales) {
        double totalAmount = this.totalSales(sales);
        double averageAmount = totalAmount / sales.length;
        //System.out.println(averageAmount);
        return averageAmount;
    }

    public long minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long countMonthBelowAverage(long[] sales) {
        double averageAmount = this.averageSales(sales);
        int belowAverageMonth = 0;
        for (long sale : sales) {
            if (sale < averageAmount) {
                belowAverageMonth = belowAverageMonth + 1;
            }
        }
        return belowAverageMonth;
    }

    public long countMonthAboveAverage(long[] sales) {
        double averageAmount = this.averageSales(sales);
        int aboveAverageMonth = 0;
         for (long sale : sales) {
            if (sale > averageAmount) {
                aboveAverageMonth = aboveAverageMonth + 1;
            }
        }
        return aboveAverageMonth;
    }
}
