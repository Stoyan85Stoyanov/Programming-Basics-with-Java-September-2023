package ConditionalStatementsAdvanced_MoreExercises03;

import java.util.Scanner;

public class _01_MatchTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleNumber = Integer.parseInt(scanner.nextLine());

        double transport = 0;
        double remaining = 0;
        double remainingmoney = 0;
        double ticket = 0;
        double notenough = 0;

        if (category.equals("Normal")) {
            ticket = 249.99 * peopleNumber;

        if (peopleNumber >= 1 && peopleNumber <= 4) {
            transport = budget * 0.75;
            remainingmoney = budget - transport;

            if (ticket < remainingmoney ) {
                remaining = remainingmoney - ticket;
                System.out.printf("Yes! You have %.2f leva left." , remaining);
            } else {
                notenough = Math.abs(remainingmoney - ticket);
                System.out.printf("Not enough money! You need %.2f leva.", notenough);
            }
        } else if (peopleNumber >= 5 && peopleNumber <= 9) {
            transport = budget * 0.60;
            remainingmoney = budget - transport;

            if (ticket < remainingmoney ) {
                remaining = remainingmoney - ticket;
                System.out.printf("Yes! You have %.2f leva left." , remaining);
            } else {
                notenough = Math.abs(remainingmoney - ticket);
                System.out.printf("Not enough money! You need %.2f leva.", notenough);
            }
        } else if (peopleNumber >= 10 && peopleNumber <= 24) {
            transport = budget * 0.50;
            remainingmoney = budget - transport;

            if (ticket < remainingmoney ) {
                remaining = remainingmoney - ticket;
                System.out.printf("Yes! You have %.2f leva left." , remaining);
            } else {
                notenough = Math.abs(remainingmoney - ticket);
                System.out.printf("Not enough money! You need %.2f leva.", notenough);
            }
        } else if (peopleNumber >= 25 && peopleNumber <= 49) {
            transport = budget * 0.40;
            remainingmoney = budget - transport;

            if (ticket < remainingmoney ) {
                remaining = remainingmoney - ticket;
                System.out.printf("Yes! You have %.2f leva left." , remaining);
            } else {
                notenough = Math.abs(remainingmoney - ticket);
                System.out.printf("Not enough money! You need %.2f leva.", notenough);
            }

        } else if (peopleNumber >= 50) {
            transport = budget * 0.25;
            remainingmoney = budget - transport;

            if (ticket < remainingmoney ) {
                remaining = remainingmoney - ticket;
                System.out.printf("Yes! You have %.2f leva left." , remaining);
            } else {
                notenough = Math.abs(remainingmoney - ticket);
                System.out.printf("Not enough money! You need %.2f leva.", notenough);
            }
         }

      }

        if (category.equals("VIP")) {
            ticket = 499.99 * peopleNumber;

                if (peopleNumber >= 1 && peopleNumber <= 4) {
                    transport = budget * 0.75;
                    remainingmoney = budget - transport;

                    if (ticket > remainingmoney ){
                        notenough = Math.abs(remainingmoney - ticket);
                        System.out.printf("Not enough money! You need %.2f leva." , notenough);
                    } else {
                        remaining = remainingmoney - ticket;
                        System.out.printf("Yes! You have %.2f leva left." , remaining);
                    }
                } else if (peopleNumber >= 5 && peopleNumber <= 9) {
                    transport = budget * 0.60;
                    remainingmoney = budget - transport;

                    if (ticket > remainingmoney ){
                        notenough = Math.abs(remainingmoney - ticket);
                        System.out.printf("Not enough money! You need %.2f leva." , notenough);
                    } else {
                        remaining = remainingmoney - ticket;
                        System.out.printf("Yes! You have %.2f leva left." , remaining);
                    }
                } else if (peopleNumber >= 10 && peopleNumber <= 24) {
                    transport = budget * 0.50;
                    remainingmoney = budget - transport;

                    if (ticket > remainingmoney ){
                        notenough = Math.abs(remainingmoney - ticket);
                        System.out.printf("Not enough money! You need %.2f leva." , notenough);
                    } else {
                        remaining = remainingmoney - ticket;
                        System.out.printf("Yes! You have %.2f leva left." , remaining);
                    }
                } else if (peopleNumber >= 25 && peopleNumber <= 49) {
                    transport = budget * 0.40;
                    remainingmoney = budget - transport;

                    if (ticket > remainingmoney ){
                        notenough = Math.abs(remainingmoney - ticket);
                        System.out.printf("Not enough money! You need %.2f leva." , notenough);
                    } else {
                        remaining = remainingmoney - ticket;
                        System.out.printf("Yes! You have %.2f leva left." , remaining);
                    }
                } else if (peopleNumber >= 50) {
                    transport = budget * 0.25;
                    remainingmoney = budget - transport;

                    if (ticket > remainingmoney ){
                        notenough = Math.abs(remainingmoney - ticket);
                        System.out.printf("Not enough money! You need %.2f leva." , notenough);
                    } else {
                        remaining = remainingmoney - ticket;
                        System.out.printf("Yes! You have %.2f leva left." , remaining);
                    }
                }
           }
      }
}


