package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _07_HousePainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenpaintExpense = 3.4;
        double redpaintExpense = 4.3;

        double rectangulardoorwidth = 1.2;
        double rectangulardoorheight = 2.0;

        double squarewindow = 1.5;

        double sidewall = x * y;
        double window = squarewindow * 1.5;
        double twopages = (2 * sidewall) - (2 * window);
        double backwall = x * x;
        double login = rectangulardoorwidth * rectangulardoorheight;
        double frontandrearTotal = 2 * backwall - login;
        double areawallsTotal = twopages + frontandrearTotal;
        double greenpaint = areawallsTotal / greenpaintExpense;

        double tworoofrectangle = 2 * (x * y);
        double twotriangles = 2 * (x * h / 2);
        double arearoofTotal = tworoofrectangle + twotriangles;
        double redpaint = arearoofTotal / redpaintExpense;

        System.out.printf("%.2f%n" , greenpaint);
        System.out.printf("%.2f" , redpaint);

    }
}
