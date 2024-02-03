package ConditionalStatementsAdvanced_MoreExercises03;

import java.util.Scanner;

public class _04_CarToGo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget =Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String kindofcars = "";
        String Class = "";
        double price = 0;


        if (budget <= 100) {
            Class = "Economy class";

            if (season.equals("Summer")) {
                kindofcars = "Cabrio";
                price = budget * 0.35;

                System.out.printf ("%s%n", Class);
                System.out.printf ("%s – %.2f", kindofcars,price);

            }else if (season.equals("Winter") ) {
                kindofcars = "Jeep";
                price = budget * 0.65;

                System.out.printf ("%s%n", Class);
                System.out.printf ("%s – %.2f", kindofcars,price);
            }
        }else if (budget > 100 && budget <= 500 ) {
            Class = "Compact class";

            if (season.equals("Summer") ) {
                kindofcars = "Cabrio";
                price = budget * 0.45;

                System.out.printf ("%s%n", Class);
                System.out.printf ("%s – %.2f", kindofcars,price);

            }else if (season.equals("Winter") ) {
                kindofcars = "Jeep";
                price = budget * 0.80;

                System.out.printf ("%s%n", Class);
                System.out.printf ("%s – %.2f", kindofcars,price);
            }
        }else if (budget > 500 ) {
            Class = "Luxury class";

            if (season.equals("Summer") || season.equals("Winter") ) {
                kindofcars = "Jeep";
                price = budget * 0.90;

                System.out.printf ("%s%n", Class);
                System.out.printf ("%s – %.2f", kindofcars,price);
            }
        }
    }
}
