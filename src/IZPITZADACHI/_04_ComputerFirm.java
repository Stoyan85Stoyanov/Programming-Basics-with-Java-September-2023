package IZPITZADACHI;

import java.util.Scanner;

public class _04_ComputerFirm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double averageRating = 0.0;
        double totalSales = 0.0;

        int computerModels = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < computerModels; i++) {
            int computerCode = Integer.parseInt(scanner.nextLine());

            int computerRating = computerCode % 10;
            int computerPossibleSales = computerCode / 10;

            double salesModifier = 0.0;
            if (computerRating == 3) {
                salesModifier = 0.5;
            } else if (computerRating == 4) {
                salesModifier = 0.7;
            } else if (computerRating == 5) {
                salesModifier = 0.85;
            } else if (computerRating == 6) {
                salesModifier = 1.0;
            }

            double computerActualSales = computerPossibleSales * salesModifier;

            totalSales += computerActualSales;
            averageRating += computerRating;
        }

        averageRating /= computerModels;

        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f%n", averageRating);

    }
}

