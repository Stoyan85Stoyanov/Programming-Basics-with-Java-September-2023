package ConditionalStatementsExercise02;

import java.util.Scanner;

public class _03_Time15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());

        int sumMinutes = (inputHours * 60) + inputMinutes + 15;

        int hours = sumMinutes / 60;
        int minutes = sumMinutes % 60;

        if (hours > 23){
            hours = 0;
        }

        if (minutes < 10){
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}

