package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _02_TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double countrya = Double.parseDouble(scanner.nextLine());
        double heighth = Double.parseDouble(scanner.nextLine());

        double Formulaarea = (countrya * heighth) / 2;

        System.out.printf("%.2f", Formulaarea);
    }
}
