package ConditionalStatementsMoreExercises02;

import java.util.Scanner;

public class _03_Harvest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyard = Integer.parseInt(scanner.nextLine());
        double grapes = Double.parseDouble(scanner.nextLine());
        int wineliters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapesTotal = vineyard * grapes;
        double wineproduction = 0.40 * (grapesTotal / 2.5);
        double remains = (wineproduction - wineliters);
        double remainswineworkers = (remains / workers);

        if (wineproduction >= wineliters) {

            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(0.40 * (grapesTotal / 2.5)));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineproduction - wineliters), Math.ceil(remainswineworkers));

        }else{

            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor( wineliters - wineproduction));
        }
    }
}

