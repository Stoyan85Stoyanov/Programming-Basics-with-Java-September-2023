package FirstStepsInCodingExercise01;

import java.util.Scanner;

public class _06_Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workerHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + (paint * (10 / 100.0))) * 14.50;
        double thinnerPrice = thinner * 5.00;

        double totalMaterialPrice = nylonPrice + paintPrice + thinnerPrice + 0.40;

        double workerPricePerHour = totalMaterialPrice * (30 / 100.0);

        double totalWorkerPrice = workerPricePerHour * workerHours;


        System.out.println(totalMaterialPrice + totalWorkerPrice);
    }
}
