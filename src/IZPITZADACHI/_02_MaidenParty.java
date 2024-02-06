package IZPITZADACHI;

import java.util.Scanner;

public class _02_MaidenParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double party = Double.parseDouble(scanner.nextLine());
        int messages = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keychains = Integer.parseInt(scanner.nextLine());
        int cartoons = Integer.parseInt(scanner.nextLine());
        int goodluck = Integer.parseInt(scanner.nextLine());

        double lovemessage = 0.60;
        double waxrose = 7.20;
        double keychain = 3.60;
        double cartoon = 18.20;
        double luckysurprise = 22;

        double sum = messages * lovemessage + roses * waxrose + keychains * keychain + cartoons * cartoon + goodluck * luckysurprise;
        double itemsNumber = messages + roses + keychains + cartoons + goodluck;

        double profit = 0;

        if (itemsNumber > 25 && profit < party) {

            double discount = sum * (35.0 / 100);
            double totalPrice = sum - discount;
            double costHosting = totalPrice * (10.0 / 100);
            profit = totalPrice - costHosting;
            double remainsSum = profit - party;

            System.out.printf("Yes! %.2f lv left.", remainsSum);

        }

        if (itemsNumber < 25 && profit < party) {
            double costHosting = sum * (10.0 / 100);
            profit = sum - costHosting;
            double remainsSum = party - profit;

            System.out.printf("Not enough money! %.2f lv needed.", remainsSum);
        }
    }
}


