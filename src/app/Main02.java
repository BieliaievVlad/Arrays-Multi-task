package app;

import java.util.Scanner;
import java.util.Locale;

public class Main02 {

    static int[][] ticket1;
    static int[][] ticket2;
    static int[][] ticket3;
    static Scanner sc;
    static int winNum;
    static int count;
    static int ticketNumber;

    public static void main(String[] args) {

        //Лотерейные билеты с фиксированным набором чисел
        ticket1 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ticket2 = new int[][]{
                {17, 18, 19, 20},
                {21, 22, 23, 24},
                {25, 26, 27, 28},
                {29, 30, 31, 32}
        };
        ticket3 = new int[][]{
                {33, 34, 35, 36},
                {37, 38, 39, 40},
                {41, 42, 43, 44},
                {45, 46, 47, 48}
        };


        sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //Выигрышный номер
        System.out.print("Enter winning number: ");
        winNum = sc.nextInt();
        sc.close();

        //Сравнение выигрышного номера с номерами в билетах
        for (int[] num : ticket1) {
            for (int n : num) {
                if (n == winNum) {
                    count++;
                    ticketNumber = 1;
                }
            }
        }

        for (int[] num : ticket2) {
            for (int n : num) {
                if (n == winNum) {
                    count++;
                    ticketNumber = 2;
                }
            }
        }

        for (int[] num : ticket3) {
            for (int n : num) {
                if (n == winNum) {
                    count++;
                    ticketNumber = 3;
                }
            }
        }


        //Вывод результата
        if (count > 0) {
            System.out.printf("%nTicket #%d is a WINNER!", ticketNumber);
        } else System.out.println("\nWe are sorry, better luck next time :(");
    }
}

