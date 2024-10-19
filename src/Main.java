public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int salary = 15_000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }


        //Задача 2
        System.out.println("Задача 2");

        int a = 1;
        while (a <= 10) {
            System.out.print(" " + a);
            a++;
        }
        System.out.println(" ");

        for (int b = 10; b >= 1; b--) {
            System.out.print(" " + b);
        }
        System.out.println(" ");


        //Задача 3
        System.out.println("Задача 3");

        int people = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            people += people * birthRate / 1000 - people * mortality / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }


        //Задача 4
        System.out.println("Задача 4");

        int sum = 15_000;
        double precent = 0.07;
        total = 0;
        month = 0;
        while (sum <= 12_000_000) {
            sum += sum * precent;
            month++;
            System.out.println("Месяц " + month + ", сумма накоаплений " + sum);
        }

        //Задача 5
        System.out.println("Задача 5");

        sum = 15_000;
        precent = 0.07;
        total = 0;
        month = 0;
        while (sum <= 12_000_000) {
            sum += sum * precent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоаплений " + sum);

            }
        }


        //Задача 6
        System.out.println("Задача 6");

        month = 0;
        int monthYear = 9 * 12;
        while (month < monthYear) {
            sum += sum * precent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоаплений " + sum);
            }
        }


        //Задача 7
        System.out.println("Задача 7");

        int friday = 5;
        for (int day = friday; day < 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }


        //Задача 8
        System.out.println("Задача 8");

        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        for (int y = 0; y < yearAfter; y = y + 79) {
            if (y > yearBefore) {
                System.out.println(y);
            }
        }


    }
}