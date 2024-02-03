package ConditionalStatementsAdvanced_MoreExercises03;

import java.util.Scanner;

public class _07_SchoolCamp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeofgroup = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int overnightstays = Integer.parseInt(scanner.nextLine());

        String sports = "";
        double priceofovernightstays = 0;
        double totalPrice = 0;

        if (typeofgroup.equals("boys")) {

            if (season.equals("Winter")) {
                priceofovernightstays = students * overnightstays * 9.60;
                sports = "Judo";

            } else if (season.equals("Spring")) {
                priceofovernightstays = students * overnightstays * 7.20;
                sports = "Tennis";

            } else if (season.equals("Summer")) {
                priceofovernightstays = students * overnightstays * 15;
                sports = "Football";
            }
        } else if (typeofgroup.equals("girls")) {

            if (season.equals("Winter")) {
                priceofovernightstays = students * overnightstays * 9.60;
                sports = "Gymnastics";

            } else if (season.equals("Spring")) {
                priceofovernightstays = students * overnightstays * 7.20;
                sports = "Athletics";

            } else if (season.equals("Summer")) {
                priceofovernightstays = students * overnightstays * 15;
                sports = "Volleyball";
            }
        } else if (typeofgroup.equals("mixed")) {

            if (season.equals("Winter")) {
                priceofovernightstays = students * overnightstays * 10;
                sports = "Ski";

            } else if (season.equals("Spring")) {
                priceofovernightstays = students * overnightstays * 9.50;
                sports = "Cycling";

            } else if (season.equals("Summer")) {
                priceofovernightstays = students * overnightstays * 20;
                sports = "Swimming";
            }

        }
        if (students >= 10 && students < 20) {
            totalPrice = priceofovernightstays - (priceofovernightstays * 0.05);
            System.out.printf("%s %.2f lv.", sports, totalPrice);

        } else if (students >= 20 && students < 50) {
            totalPrice = priceofovernightstays - (priceofovernightstays * 0.15);
            System.out.printf("%s %.2f lv.", sports, totalPrice);

        } else if (students >= 50) {
            totalPrice = priceofovernightstays - (priceofovernightstays * 0.50);
            System.out.printf("%s %.2f lv.", sports, totalPrice);

        } else {
            totalPrice = priceofovernightstays;
            System.out.printf("%s %.2f lv.", sports, totalPrice);

        }
    }
}




