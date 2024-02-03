package ConditionalStatementsAdvanced_MoreExercises03;

import java.util.Scanner;

public class _06_TruckDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometerspermonth = Double.parseDouble(scanner.nextLine());
        double salary = 0;
        double salaryaftertaxes = 0;


        if (kilometerspermonth <= 5000 && season.equals("Spring")) {

            salary = kilometerspermonth * 0.75 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth <= 5000 && season.equals("Autumn")) {

            salary = kilometerspermonth * 0.75 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth <= 5000 && season.equals("Summer")) {

            salary = kilometerspermonth * 0.90 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth <= 5000 && season.equals("Winter")) {

            salary = kilometerspermonth * 1.05 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        }

        if (kilometerspermonth > 5000 && kilometerspermonth <= 10000 && season.equals("Spring")) {

            salary = kilometerspermonth * 0.95 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth > 5000 && kilometerspermonth <= 10000 && season.equals("Autumn")) {

            salary = kilometerspermonth * 0.95 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth > 5000 && kilometerspermonth <= 10000 && season.equals("Summer")) {

            salary = kilometerspermonth * 1.10 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth > 5000 && kilometerspermonth <= 10000 && season.equals("Winter")) {

            salary = kilometerspermonth * 1.25 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);
        }

        if (kilometerspermonth > 10000 && kilometerspermonth <= 20000 && season.equals("Spring")) {

            salary = kilometerspermonth * 1.45 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth > 10000 && kilometerspermonth <= 20000 && season.equals("Autumn")) {

            salary = kilometerspermonth * 1.45 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth > 10000 && kilometerspermonth <= 20000 && season.equals("Summer")) {

            salary = kilometerspermonth * 1.45 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);

        } else if (kilometerspermonth > 10000 && kilometerspermonth <= 20000 && season.equals("Winter")) {

            salary = kilometerspermonth * 1.45 * 4;
            salaryaftertaxes = salary - (salary * 0.10);

            System.out.printf("%.2f", salaryaftertaxes);
        }
    }
}

