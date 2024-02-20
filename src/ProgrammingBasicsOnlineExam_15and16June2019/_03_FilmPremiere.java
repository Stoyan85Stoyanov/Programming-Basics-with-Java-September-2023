package ProgrammingBasicsOnlineExam_15and16June2019;

import java.util.Scanner;

public class _03_FilmPremiere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        String packMovie = scanner.nextLine();
        int ticketsNumber = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (projection) {
            case "John Wick":
                if ("Drink".equals(packMovie)) {
                    price += 12 * ticketsNumber;
                } else if ("Popcorn".equals(packMovie)) {
                    price += 15 * ticketsNumber;
                } else if ("Menu".equals(packMovie)) {
                    price += 19 * ticketsNumber;
                }
                break;
            case "Star Wars":
                if ("Drink".equals(packMovie)) {
                    price += 18 * ticketsNumber;
                } else if ("Popcorn".equals(packMovie)) {
                    price += 25 * ticketsNumber;
                } else if ("Menu".equals(packMovie)) {
                    price += 30 * ticketsNumber;
                }
                if (ticketsNumber >= 4) {
                    price *= 0.7;
                }
                break;
            case "Jumanji":
                if ("Drink".equals(packMovie)) {
                    price += 9 * ticketsNumber;
                } else if ("Popcorn".equals(packMovie)) {
                    price += 11 * ticketsNumber;
                } else if ("Menu".equals(packMovie)) {
                    price += 14 * ticketsNumber;
                }
                if (ticketsNumber == 2) {
                    price *= 0.85;
                }
                break;
        }
        System.out.println(String.format("Your bill is %.2f leva.", price));


    }
}
