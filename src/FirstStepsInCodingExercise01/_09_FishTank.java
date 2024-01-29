package FirstStepsInCodingExercise01;

import java.util.Scanner;

public class _09_FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthInCm = Integer.parseInt(scanner.nextLine());
        int widthInCm = Integer.parseInt(scanner.nextLine());
        int heightInCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInCm = lengthInCm * widthInCm * heightInCm;

        double volumeInLiters = volumeInCm / 1000;
        double takenPlace = volumeInLiters * (percent / 100.0);

        System.out.println(volumeInLiters - takenPlace);
    }
}
