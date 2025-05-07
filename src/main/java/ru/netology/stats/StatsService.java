package ru.netology.stats;

public class StatsService {
    public long allSalesSum(long[] sale) { // 1) сумма может быть свыше 2 млрд, целое число, 2) параметр с типом массив может быть свыше 2 млрд, целое число
        long sum = 0; //сумма продаж может быть свыше 2 млрд, целое число
        for (long purchase : sale) { //целое число, может превышать 2 млрд
            sum += purchase;
        }
        return sum;
    }

    public long saleAverageMonth(long[] sale) { // 1) сумма может быть свыше 2 млрд, целое число, 2) параметр с типом массив может быть свыше 2 млрд, целое число
        int numberSale = sale.length; // не превышает 2 млрд, целое число
        long sum = allSalesSum(sale); //сумма может быть свыше 2 млрд, целое число
        long averageMonth = sum / numberSale; //сумма может быть свыше 2 млрд, целое число
        return averageMonth;
    }

    public int maxSale(long[] sale) { //1) не превышает 2 млрд, целое число, 2) параметр с типом массив может быть свыше 2 млрд, целое число
        int maxMonth = 0; //месяц целое число, не превышает 2 млрд

        for (int i = 0; i < sale.length; i++) { //целое число до 2 млрд
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { // 1) не превышает 2 млрд, целое число, 2) параметр с типом массив может быть свыше 2 млрд, целое число
        int minMonth = 0; // месяц не превышает 2 млрд, целое число

        for (int i = 0; i < sales.length; i++) { //целое число до 2 млрд
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int saleBelowAverage(long[] sale) { // 1) месяц, целое число до 2 млрд, целое число 2) параметр с типом массив может быть свыше 2 млрд, целое число
        int averageSum = (int) saleAverageMonth(sale); //целое число до 2 млрд в обоих случаях
        int numberBelowAverage = 0; //целое число до 2 млрд

        for (int i = 0; i < sale.length; i++) { //целое число до 2 млрд
            if (sale[i] < averageSum) {
                numberBelowAverage = numberBelowAverage + 1;
            }
        }
        return numberBelowAverage;
    }

    public int saleAboveAverage(long[] sale) { // 1) месяц, целое число до 2 млрд, целое число 2) параметр с типом массив может быть свыше 2 млрд, целое число
        int averageSum = (int) saleAverageMonth(sale); //целое число до 2 млрд
        int numberAboveAverage = 0; //целое число до 2 млрд

        for (int i = 0; i < sale.length; i++) {//целое число до 2 млрд
            if (sale[i] > averageSum) {
                numberAboveAverage = numberAboveAverage + 1;
            }
        }
        return numberAboveAverage;
    }

}
