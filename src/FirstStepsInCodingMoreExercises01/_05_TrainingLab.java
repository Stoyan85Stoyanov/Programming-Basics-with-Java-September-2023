package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());


         double hallwidth = width * 100;
         double freespace = hallwidth - 100;
         double desknumber = Math.floor(freespace / 70);


         double halllength = length * 100;
         double rownumber = Math.floor(halllength / 120);


         double totalplacesnumber = desknumber * rownumber - 3;

         System.out.printf("%.0f" , totalplacesnumber);

       


    }
}
