package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findMiddleSale(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowerMiddleSale(int[] sales) {
        int MiddleSale = findMiddleSale(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < MiddleSale) {
                month = month + 1;
            }
        }
        return month;
    }

    public int upperMiddleSale(int[] sales) {
        int MiddleSale = findMiddleSale(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > MiddleSale) {
                month = month + 1;
            }
        }
        return month;
    }
}

