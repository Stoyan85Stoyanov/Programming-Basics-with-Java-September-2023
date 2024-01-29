package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _01_TrapeziodArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double basisb1 = Double.parseDouble(scanner.nextLine());
        double basisb2 = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double Formula = ((basisb1 + basisb2) * height) / 2;

        System.out.printf("%.2f", Formula);


    }
}
