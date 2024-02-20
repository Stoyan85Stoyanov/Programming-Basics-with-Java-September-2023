package ProgrammingBasicsOnlineExam_15and16June2019;

import java.util.Scanner;

public class _03_MovieDestination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0.00;


        switch (destination) {
            case "Dubai":
                if ("Summer".equals(season)) {
                    price = 40000;
                    price = (price * days) * 0.70;
                } else if ("Winter".equals(season)) {
                    price = 45000;
                    price = (price * days) * 0.70;
                }
                break;

            case "Sofia":
                if ("Summer".equals(season)) {
                    price = 12500;
                    price = (price * days) * 1.25;
                } else if ("Winter".equals(season)) {
                    price = 17000;
                    price = (price * days) * 1.25;

                }
                break;

            case "London":
                if ("Summer".equals(season)) {
                    price = 20250;
                } else if ("Winter".equals(season)) {
                    price = 24000;
                }
                price = price * days;
                break;
        }
        if (price > budget) {
            System.out.printf("The director needs %.2f leva more!", price - budget);
        }else {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - price  );
        }
    }
}

