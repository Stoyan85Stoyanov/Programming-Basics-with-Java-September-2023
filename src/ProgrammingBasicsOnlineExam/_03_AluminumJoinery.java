package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class _03_AluminumJoinery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int joinery = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine();
        String receiving = scanner.nextLine();

        double price = 0.00;
        double totalSum = 0.00;

        if (joinery < 10) {
            System.out.println("Invalid order");

        } else {
            switch (joineryType) {
                case "90X130":
                    price = 110;
                    if (joinery > 30 && joinery <= 60) {
                        price *= 0.95;
                    } else if (joinery > 60) {
                        price *= 0.92;
                        ;
                    }
                    break;
                case "100X150":
                    price = 140;
                    if (joinery > 40 && joinery <= 80) {
                        price *= 0.94;
                    } else if (joinery > 80) {
                        price *= 0.90;
                    }
                    break;
                case "130X180":
                    price = 190;
                    if (joinery > 20 && joinery <= 50) {
                        price *= 0.93;
                    } else if (joinery > 50) {
                        price *= 0.88;
                    }
                    break;
                case "200X300":
                    price = 250;
                    if (joinery > 25 && joinery <= 50) {
                        price *= 0.91;
                    } else if (joinery > 50) {
                        price *= 0.86;
                    }
                    break;
            }

            double totalPrice = joinery * price;

            if (joinery > 99) {
                price *= 0.96;

                switch (receiving) {
                    case "With delivery":
                        totalPrice += 60;
                        break;
                    case "Without delivery":
                        totalSum = totalSum;
                        break;

                }
                price *= 0.96;

                System.out.printf("%.2f BGN", totalPrice);
            }
        }
    }
}
