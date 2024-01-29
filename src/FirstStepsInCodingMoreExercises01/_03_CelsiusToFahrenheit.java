package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _03_CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());
        double result = celsius * 1.8;
        double Formula = result + 32;

        System.out.printf("%.2f", Formula);
    }
}
