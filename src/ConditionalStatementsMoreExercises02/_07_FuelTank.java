package ConditionalStatementsMoreExercises02;

import java.util.Scanner;

public class _07_FuelTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());

        boolean validFuel = (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas"));

            if (!validFuel) {
                System.out.println("Invalid fuel!");

            } else if (fuelLiters >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());

            } else if (fuelLiters < 25) {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());

            }

        }
    }

