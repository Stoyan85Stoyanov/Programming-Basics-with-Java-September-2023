package ForLoopMoreExercises05;

import java.util.Scanner;

public class _06_Bills {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double Electricity = 0;
        double Water = 0;
        double Internet = 0;
        double Other = 0;
        double Average = 0;
        double months = 0;

        for (int i = 0; i < n; i++) {
            months = Double.parseDouble(scanner.nextLine());
            Electricity += months;
        }
        Water = n * 20;
        Internet = n * 15;
        Other = (Electricity + 20 * n + 15 * n) * 1.20;
        Average = (Electricity + Water + Internet + Other) / n;

        System.out.printf("Electricity: %.2f lv%n" , Electricity);
        System.out.printf("Water: %.2f lv%n" , Water);
        System.out.printf("Internet: %.2f lv%n" , Internet);
        System.out.printf("Other: %.2f lv%n" , Other);
        System.out.printf("Average: %.2f lv%n", Average);
    }
}

