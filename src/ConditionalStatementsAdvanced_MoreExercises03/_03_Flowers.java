package ConditionalStatementsAdvanced_MoreExercises03;

import java.util.Scanner;

public class _03_Flowers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isItSpecialDay = scanner.nextLine();

        double totalAmountOfFlowersBought = chrysanthemums + roses + tulips;
        double priceInCurrentSeason = 0;
        double price = 0;

        if (season.equals("Spring") || season.equals("Summer")) {
            priceInCurrentSeason = (chrysanthemums * 2.00) + (roses * 4.10) + (tulips * 2.50);
            price = priceInCurrentSeason;

            if (isItSpecialDay.equals("Y")) {

                price = price + (price * 0.15);
            }
            if (tulips > 7 && season.equals("Spring")) {

                price = price - (price * 0.05);
            }

        }else if (season.equals("Autumn") || season.equals("Winter")) {

            priceInCurrentSeason = (chrysanthemums * 3.75) + (roses * 4.50) + (tulips * 4.15);
            price = priceInCurrentSeason;

            if (isItSpecialDay.equals("Y")) {

                price = price + (price * 0.15);
            }
            if (roses >= 10 && season.equals("Winter")) {
                price = price - (price * 0.10);
            }
        }
        if (totalAmountOfFlowersBought > 20) {
            price = price - (price * 0.20);

            System.out.printf("%.2f", price + 2);

        }else {

            System.out.printf("%.2f", price + 2);
        }
    }
}

