package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _08_CircleAreaandPerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double S = Math.PI * r * r;
        double P = Math.PI * 2 * r;

        System.out.printf("%.2f%n" , S);
        System.out.printf("%.2f" , P);
    }
}
