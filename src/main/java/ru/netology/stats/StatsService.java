package ru.netology.stats;

public class StatsService {
    public long allSalesSum(int[] sale) { //сумма всех продаж (1. использую long, т.к. сумма может быть до 5 млрд, что превышает значение типов int, 2. параметр с типом массив)
        long sum = 0; //сумма продаж более 5 млрд
        for (int purchase : sale) { // целое число, поэтому int, не превышает 5 млрд
            sum += purchase;
        }
        return sum;
    }

    public double saleAverageMonth(int[] sale) { // средняя сумма продаж в месяц (1. использую double, т.к. считаем среднюю сумму и получаем не целое число, 2. параметр с типом массив)
       int numberSale = sale.length; // (int, т.к. целое число, не превышает 5 млрд)
        long sum = allSalesSum(sale); //(использую long, т.к. это сумма)
        double averageMonth = sum / numberSale; //считаем среднюю, поэтому double, не целое число
        return averageMonth;
    }

    public int maxSale(int[] sale) { // месяц продаж на максимальную сумму (1. используем int, т.к. идет расчет месяца, число не превышает 2 млрд., все остальные случаи так же, 2. параметр с типом массив)
        int maxMonth = sale[0]; //месяц целое число

        for (int i = 0; i < sale.length; i++) { //целое число до 2 млрд
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) { //месяц продаж на минимальную сумму (то же самое, считаем месяц, где будет использоваться целое число до 2 млрд, во втором случае массив)
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int saleBelowAverage(int[] sale) { // месяц, где продажи ниже среднего (месяц, целое число до 2 млрд, поэтому int, во втором случае массив)
        int averageSum = (int) saleAverageMonth(sale); //double в обоих случаях, т.к. считаем среднюю, ответ скорее всего не целое число
        int numberBelowAverage = 0; //целое число до 2 млрд

        for (int i = 0; i < sale.length; i++) { //целое число до 2 млрд
            if (sale[i] < averageSum) {
                numberBelowAverage = numberBelowAverage + 1;
            }
        }
        return numberBelowAverage;
    }

    public int saleAboveAverage(int[] sale) { // месяц, где продажи выше среднего (месяц, целое число до 2 млрд, поэтому int, во втором случае массив)
        int averageSum = (int) saleAverageMonth(sale); //double в обоих случаях, т.к. считаем среднюю, ответ скорее всего не целое число
        int numberAboveAverage = 0; //целое число до 2 млрд

        for (int i = 0; i < sale.length; i++) {//целое число до 2 млрд
            if (sale[i] > averageSum) {
                numberAboveAverage = numberAboveAverage + 1;
            }
        }
        return numberAboveAverage;
    }

}
