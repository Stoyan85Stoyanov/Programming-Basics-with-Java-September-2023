package ConditionalStatementsAdvanced_MoreExercises03;

import java.util.Scanner;

public class _08_PointonRectangleBorder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());


        if ((((x == x1) || (x == x2)) && (y1 <= y) && (y <= y2)) || (((y == y1) || (y == y2)) && (x1 <= x) && (x <= x2))) {

                System.out.print("Border");

            } else {
                System.out.print("Inside / Outside");
        }
    }
}




