package IZPITZADACHI;

import java.util.Scanner;

public class _05_HairSalon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        double earnedNoney = 0;

        String input = scanner.nextLine();
        while (!"closed".equals(input)) {

            String nextInput = scanner.nextLine();

            switch (input) {
                case "haircut":
                    if (nextInput.equals("mens")) {
                        earnedNoney += 15;
                    } else if (nextInput.equals("ladies")) {
                        earnedNoney += 20;
                    } else if (nextInput.equals("kids")) {
                        earnedNoney += 10;
                    }
                    break;
                case "color":
                    if (nextInput.equals("touch up")) {
                        earnedNoney += 20;
                    } else if (nextInput.equals("full color")) {
                        earnedNoney += 30;
                    }
                    break;
            }

            if (earnedNoney >= target) {
                break;
            }

            input = scanner.nextLine();
        }



        if (earnedNoney >= target) {
            System.out.println("You have reached your target for the day!");
        } else {
            double neededMoney = target - earnedNoney;
            System.out.printf("Target not reached! You need %.0flv. more.%n", neededMoney);
        }

        System.out.printf("Earned money: %.0flv.", earnedNoney);
    }
}
