//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("____________");
        System.out.println("Задача 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("____________");
        System.out.println("Задача 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("____________");
        System.out.println("Задача 3:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("____________");
        System.out.println("Задача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("____________");
        System.out.println("Задача 5:");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
        System.out.println("____________");
        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("____________");
        System.out.println("Задача 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("____________");
        System.out.println("Задача 8:");
        int monthlySavings = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("____________");
        System.out.println("Задача 9:");
        int monthlyDeposit = 29000;
        int totalWithPercent = 0;
        for (int month = 1; month <= 12; month++) {
            totalWithPercent += monthlyDeposit;
            totalWithPercent += totalWithPercent / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercent + " рублей");
        }
        System.out.println("____________");
        System.out.println("Задача 10:");
        int multiplier = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplier + "*" + i + "=" + (multiplier * i));
        }
    }
}