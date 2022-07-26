package ru.netology.stats;

public class StatsService {

    public int sum(int[] profits) {
        int sum = 0;
        for (int profit : profits) {
            sum += profit;
        }
        System.out.println("Сумма всех продаж: " + sum);
        return sum;
    }

    public int avarageSum(int[] profits) {
        int sum = 0;
        for (int i = 0; i < profits.length; i++) {
            sum += profits[i];
        }
        sum /= profits.length;
        System.out.println("Средняя сумма продаж в месяц: " + sum);
        return sum;
    }

    public int maxSales(int[] profits) {
        int max = 0;
        for (int i = 0; i < profits.length; i++) {
            if (profits[i] > profits[max]) {
                max = i;
            }
        }
        System.out.println("Номер месяца, в котором была максимальная сумма продаж: " + max);
        return max;
    }

    public int minSales(int[] profits) {
        int min = 0;
        for (int i = 0; i < profits.length; i++) {
            if (profits[i] < profits[min]) {
                min = i;
            }
        }
        System.out.println("Номер месяца, в котором была минимальная сумма продаж: " + min);
        return min;
    }

    public int minCountMonth(int[] profits, int averageSum) {
//        int averageSum = 15;
        int count = 0;
        for (int i = 0; i < profits.length; i++) {
            if (profits[i] < averageSum) {
                count += 1;
            }
        }
        System.out.println("Количество месяцев, значение которых ниже средней суммы продаж в месяц: " + count);
        return count;
    }

    public int maxCountMonth(int[] profits, int averageSum) {
//        int avarageSum = 15;
        int count = 0;
        for (int i = 0; i < profits.length; i++) {
            if (profits[i] > averageSum) {
                count += 1;
            }
        }
        System.out.println("Количество месяцев, значение которых выше средней суммы продаж в месяц: " + count);
        return count;
    }
}
