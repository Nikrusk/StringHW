package ru.netology.stats;

public class StatsService {
    public long allSalesSum(int[] sale) { //сумма всех продаж (использую long, т.к. сумма может быть до 5 млрд, что превышает значение типов int)
        long sum = 0;
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public double saleAverageMonth(int[] sale) { // средняя сумма продаж в месяц (использую double, т.к. считаем среднюю сумму и получаем не целое число)
       int numberSale = sale.length;
        long sum = allSalesSum(sale); //(использую long, т.к. это сумма)
        double averageMonth = sum / numberSale;
        return averageMonth;
    }

    public int maxSale(int[] sale) { // месяц продаж на максимальную сумму (используем int, т.к. идет расчет месяца, число не превышает 2 млрд., все остальные случаи так же)
        int maxMonth = sale[0];

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) { //месяц продаж на минимальную сумму
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int saleBelowAverage(int[] sale) { // месяц, где продажи ниже среднего
        int averageSum = (int) saleAverageMonth(sale);
        int numberBelowAverage = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averageSum) {
                numberBelowAverage = numberBelowAverage + 1;
            }
        }
        return numberBelowAverage;
    }

    public int saleAboveAverage(int[] sale) { // месяц, где продажи выше среднего
        int averageSum = (int) saleAverageMonth(sale);
        int numberAboveAverage = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSum) {
                numberAboveAverage = numberAboveAverage + 1;
            }
        }
        return numberAboveAverage;
    }

}
