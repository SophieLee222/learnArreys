package ru.netology.learnArreys.stats;

import java.util.Arrays;
import java.util.OptionalDouble;

public class StatsService {

    //1 - Сумма всех продаж
    public long calculateSum(long[] sales) {
        long salesSum = Arrays.stream(sales).sum();
        return salesSum;
    }

    //2 - Среднее значение суммы всех продаж
    public double calculateAverage(long[] sales) {
        double salesAverage = Arrays.stream(sales).average().getAsDouble();
        return salesAverage;
    }

    //3 - Номер месяца максимальных продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //4 - Номер месяца минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //5 - Кол-во месяцев, когда продажи ниже среднего
    public int countMonthsBelowAverage (long[] sales) {
        double salesAverage = calculateAverage(sales);
        int countBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAverage) {
                countBelowAverage++;
            }
        }
        return countBelowAverage;
    }

    //6 - Кол-во месяцев, когда продажи выше среднего
    public int countMonthsAboveAverage (long[] sales) {
        double salesAverage = calculateAverage(sales);
        int countAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAverage) {
                countAboveAverage++;
            }
        }
        return countAboveAverage;
    }
}
