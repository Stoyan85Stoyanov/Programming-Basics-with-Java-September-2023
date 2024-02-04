package ForLoopMoreExercises05;

import java.util.Scanner;

public class _02_Hospital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        double treated = 0;
        double untreated = 0;

        for (int i = 1; i <= days; i++) {

            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && untreated > treated) {

                doctors += 1;
            }

            if (patients < doctors) {

                treated += patients;

            }else {

                treated += doctors;
                untreated += patients - doctors;
            }
          }

        System.out.printf("Treated patients: %.0f.%n", treated);
        System.out.printf("Untreated patients: %.0f.", untreated);
       }
    }





