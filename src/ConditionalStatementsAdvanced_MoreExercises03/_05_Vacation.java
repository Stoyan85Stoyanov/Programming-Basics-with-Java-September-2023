package ConditionalStatementsAdvanced_MoreExercises03;

import java.util.Scanner;

public class _05_Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String locations = "";
        String Accommodation = "";
        double price = 0;


        if (budget <= 1000) {
            Accommodation = "Camp";

            if (season.equals("Summer")) {
                locations = "Alaska";
                price = budget * 0.65;

                System.out.printf("%s - %s - %.2f", locations, Accommodation, price);

            } else if (season.equals("Winter")) {
                locations = "Morocco";
                price = budget * 0.45;

                System.out.printf("%s - %s - %.2f", locations, Accommodation, price);
            }
        } else if (budget > 1000 && budget <= 3000) {
            Accommodation = "Hut";

            if (season.equals("Summer")) {
                locations = "Alaska";
                price = budget * 0.80;

                System.out.printf("%s - %s - %.2f", locations, Accommodation, price);

            } else if (season.equals("Winter")) {
                locations = "Morocco";
                price = budget * 0.60;

                System.out.printf("%s - %s - %.2f", locations, Accommodation, price);
            }
        } else if (budget > 3000) {
            Accommodation = "Hotel";

            if (season.equals("Summer")) {
                locations = "Alaska";
                price = budget * 0.90;

                System.out.printf("%s - %s - %.2f", locations, Accommodation, price);

            } else if (season.equals("Winter")) {
                locations = "Morocco";
                price = budget * 0.90;

                System.out.printf("%s - %s - %.2f", locations, Accommodation, price);
            }
        }
    }
}

