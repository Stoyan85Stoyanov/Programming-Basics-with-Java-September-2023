package Exam;

import java.util.Scanner;

public class _03_SantasHoliday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysstay = Integer.parseInt(scanner.nextLine());
        String typeroom = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double price = 0;

        switch (typeroom) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;

                if (daysstay < 10) {
                    price *= 0.7;
                } else if (daysstay < 15) {
                    price *= 0.65;
                } else if (daysstay > 15) {
                    price *= 0.5;
                }
                break;

            case "president apartment":
                price = 35;

                if (daysstay < 10) {
                    price *= 0.9;
                } else if (daysstay < 15) {
                    price *= 0.85;
                } else if (daysstay > 15) {
                    price *= 0.8;
                }
                break;

        }
        double totalPrice = (daysstay - 1) * price;

        if (evaluation.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else if (evaluation.equals("negative")) {
            totalPrice = totalPrice * 0.9;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
