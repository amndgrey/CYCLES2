package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();

        int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int totalSum = service.sum(profits);
        int averageSum = service.avarageSum(profits);
        int maxSales = service.maxSales(profits);
        int minSales = service.minSales(profits);
        int averageMin = service.minCountMonth(profits, averageSum);
        int averageMax = service.maxCountMonth(profits, averageSum);
    }
}