package WhileLoopMoreExercises04;

import java.util.Scanner;

public class _02_ReportSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salesSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0, cash = 0, card = 0, prices = 0, cashPerson = 0, cardPerson = 0, allPrice = 0;

        while (!input.equals("End")) {
            prices = Integer.parseInt(input);
            count++;

            if (count % 2 == 0) {
                if (prices < 10) {
                    System.out.println("Error in transaction!");

                } else {
                    cardPerson++;
                    card += prices;
                    System.out.println("Product sold!");
                    allPrice += prices;
                }
            } else {
                if (prices > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cashPerson++;
                    cash += prices;
                    System.out.println("Product sold!");
                    allPrice += prices;
                }
            }

            if (allPrice >= salesSum) {
                break;
            }
            input = scanner.nextLine();
        }
        if (allPrice < salesSum) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            double sumCash = cash * 1.0 / cashPerson;
            double sumCard = card * 1.0 / cardPerson;
            System.out.printf("Average CS: %.2f%n", sumCash);
            System.out.printf("Average CC: %.2f", sumCard);
        }
    }
}

