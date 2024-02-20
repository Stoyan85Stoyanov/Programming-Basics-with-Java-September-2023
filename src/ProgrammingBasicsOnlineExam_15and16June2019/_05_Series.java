package ProgrammingBasicsOnlineExam_15and16June2019;

import java.util.Scanner;

public class _05_Series {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int seriesNumber = Integer.parseInt(scanner.nextLine());

        double seriesPrice = 0.00;
        for (int i = 0; i < seriesNumber; i++) {

            String seriesName = scanner.nextLine();
            seriesPrice = Double.parseDouble(scanner.nextLine());

            switch (seriesName) {
                case "Thrones":
                    seriesPrice *= 0.5;
                    break;
                case "Lucifer":
                    seriesPrice *= 0.6;
                    break;
                case "Protector":
                    seriesPrice *= 0.7;
                    break;
                case "TotalDrama":
                    seriesPrice *= 0.8;
                    break;
                case "Area":
                    seriesPrice *= 0.9;
                    break;

            }
            budget -= seriesPrice;
        }
        if (budget < 0) {
            System.out.println(String.format("You need %.2f lv. more to buy the series!", Math.abs(budget)));
        } else {
            System.out.println(String.format("You bought all the series and left with %.2f lv.", budget));
        }
    }
}
