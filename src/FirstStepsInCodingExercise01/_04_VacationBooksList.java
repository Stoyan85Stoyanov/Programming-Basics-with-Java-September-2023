package FirstStepsInCodingExercise01;

import java.util.Scanner;

public class _04_VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int totalDays = Integer.parseInt(scanner.nextLine());

        int totalHours = totalPages / pagesPerHour;

        int hoursPerDay = totalHours / totalDays;

        System.out.println(hoursPerDay);

    }
}
