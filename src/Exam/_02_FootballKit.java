package Exam;

import java.util.Scanner;

public class _02_FootballKit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tshirtPrice = Double.parseDouble(scanner.nextLine());
        double ballSum = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tshirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double buttonsPrice = (tshirtPrice + shortsPrice) * 2;
        double totalSum = tshirtPrice + shortsPrice + socksPrice + buttonsPrice;
        double amountafterDiscount = totalSum - (totalSum * (15.0/100));
        double neededamount = ballSum - amountafterDiscount;

        if (amountafterDiscount >= ballSum) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", amountafterDiscount);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", neededamount);
        }

    }
}
