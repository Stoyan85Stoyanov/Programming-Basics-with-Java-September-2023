package ConditionalStatementsMoreExercises02;

import java.util.Scanner;

public class _08_FuelTank_Part2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String clubcardPossession = scanner.nextLine();

        double price = 0;

        if (clubcardPossession.equals("Yes")) {
            switch (fuelType) {
                case "Diesel":
                    price = fuelAmount * (2.33 - 0.12);
                    break;
                case "Gasoline":
                    price = fuelAmount * (2.22 - 0.18);
                    break;
                case "Gas":
                    price = fuelAmount * (0.93 - 0.08);
                    break;
            }
        } else {
            switch (fuelType) {
                case "Diesel":
                    price = fuelAmount * 2.33;
                    break;
                case "Gasoline":
                    price = fuelAmount * 2.22;
                    break;
                case "Gas":
                    price = fuelAmount * 0.93;
                    break;
            }

        }
        if (fuelAmount >= 20 && fuelAmount <= 25) {
            price *= 0.92;
            System.out.printf("%.2f lv.", price);

        } else if (fuelAmount > 25) {
            price *= 0.90;
            System.out.printf("%.2f lv.", price);

        } else {
            System.out.printf("%.2f lv.", price);
        }
    }
}
