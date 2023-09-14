package app;

import java.util.Scanner;
import java.util.Locale;

public class Main01 {

    static int[][] ticket;
    static Scanner sc;
    static int winNum;
    static int count;

    public static void main(String[] args) {

        //Лотерейный билет с фиксированным набором чисел
        ticket = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //Выигрышный номер
        System.out.print("Enter winning number: ");
        winNum = sc.nextInt();
        sc.close();

        //Сравнение выигрышного номера с номерами в билете
        for (int[] num : ticket) {
            for (int n : num) {
                if (n == winNum) {
                    count++;
                }
            }
        }

        //Вывод результата
        if (count > 0)
            System.out.println("\nYou are a WINNER!");
        else System.out.println("\nWe are sorry, better luck next time :(");
    }
}
