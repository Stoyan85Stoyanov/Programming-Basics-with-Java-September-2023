package FirstStepsInCodingExercise01;

import java.util.Scanner;

public class _07_FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double menusPrice = (chickenMenus * 10.35) + (fishMenus * 12.40) + (vegetarianMenus * 8.15);
        double desertPrice = menusPrice * 0.20;

        double totalPrice = menusPrice + desertPrice + 2.50;

        System.out.println(totalPrice);
    }
}
