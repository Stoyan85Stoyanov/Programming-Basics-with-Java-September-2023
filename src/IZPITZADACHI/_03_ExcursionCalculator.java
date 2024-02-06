package IZPITZADACHI;

import java.util.Scanner;

public class _03_ExcursionCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;
        double discount = 0;

        if (season.equals("spring")) {
            if (peopleNumber == 5) {
                price = 50.00;
                totalPrice = peopleNumber * price;
                System.out.printf("%.2f leva.", totalPrice);

            } else if (peopleNumber > 5) {
                price = 48.00;
            }
        }
        if (season.equals("summer")) {
            if (peopleNumber == 5) {
                price = 48.50;

            } else if (peopleNumber > 5) {
                price = 45.00;
                totalPrice = peopleNumber * price;
                discount = totalPrice - (totalPrice * (15.0 / 100));
                System.out.printf("%.2f leva.", discount);
            }
        }
        if (season.equals("autumn")) {
            if (peopleNumber == 5) {
                price = 60.00;

            } else if (peopleNumber > 5) {
                price = 49.50;
                totalPrice = peopleNumber * price;
                System.out.printf("%.2f leva.", totalPrice);
            }
        }
        if (season.equals("winter")) {
            if (peopleNumber == 5) {
                price = 86.00;

            } else if (peopleNumber > 5) {
                price = 85.00;
                totalPrice = peopleNumber * price;
                discount = totalPrice + (totalPrice * (8.0 / 100));
                System.out.printf("%.2f leva.", discount);
            }
        }
    }
}



