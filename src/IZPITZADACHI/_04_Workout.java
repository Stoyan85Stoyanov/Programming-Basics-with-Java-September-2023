package IZPITZADACHI;

import java.util.Scanner;

public class _04_Workout {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kilometersPerDay = Double.parseDouble(scanner.nextLine());


        double allKilometers = kilometersPerDay;

        for (int i = 0; i < days; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            kilometersPerDay = kilometersPerDay + (kilometersPerDay * (currentNumber / 100.0));
            allKilometers += kilometersPerDay;
        }


        if (allKilometers >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(allKilometers-1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - allKilometers));





        }


        }
}
