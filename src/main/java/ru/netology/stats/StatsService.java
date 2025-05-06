package ru.netology.stats;

public class StatsService {
    public long allSalesSum(long[] sale) { //сумма всех продаж (1. использую long, т.к. сумма может быть свыше 2 млрд, целое число, 2. параметр с типом массив может быть свыше 2 млрд, целое число)
        long sum = 0; //сумма продаж свыше 2 млрд
        for (long purchase : sale) { // целое число, поэтому int, не превышает 2 млрд
            sum += purchase;
        }
        return sum;
    }

    public long saleAverageMonth(long[] sale) { // средняя сумма продаж в месяц (1. сумма может быть свыше 2 млрд, целое число, 2. параметр с типом массив может быть свыше 2 млрд, целое число)
        int numberSale = sale.length; // (int, т.к. целое число, не превышает 2 млрд)
        long sum = allSalesSum(sale); //(использую long, т.к. это сумма может быть свыше 2 млрд, целое число)
        long averageMonth = sum / numberSale; //сумма может быть свыше 2 млрд, целое число
        return averageMonth;
    }

    public int maxSale(long[] sale) { // месяц продаж на максимальную сумму (1. используем int, т.к. идет расчет месяца, число не превышает 2 млрд., , 2. параметр с типом массив не превышает 2 млрд, целое число)
        int maxMonth = 0; //месяц целое число, не превышает 2 млрд

        for (int i = 0; i < sale.length; i++) { //целое число до 2 млрд
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { //месяц продаж на минимальную сумму (то же самое, считаем месяц, где будет использоваться целое число до 2 млрд, во втором случае массив может превышать 2 млрд)
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее (месяц до 2 млрд, целое число)

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int saleBelowAverage(long[] sale) { // месяц, где продажи ниже среднего (месяц, целое число до 2 млрд, целое число, поэтому int, во втором случае массив может превышать 2 млрд)
        int averageSum = (int) saleAverageMonth(sale); //double в обоих случаях, т.к. считаем среднюю, ответ скорее всего не целое число
        int numberBelowAverage = 0; //целое число до 2 млрд

        for (int i = 0; i < sale.length; i++) { //целое число до 2 млрд
            if (sale[i] < averageSum) {
                numberBelowAverage = numberBelowAverage + 1;
            }
        }
        return numberBelowAverage;
    }

    public int saleAboveAverage(long[] sale) { // месяц, где продажи выше среднего (месяц, целое число до 2 млрд, поэтому int, во втором случае массив может превышать 2 млрд)
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
