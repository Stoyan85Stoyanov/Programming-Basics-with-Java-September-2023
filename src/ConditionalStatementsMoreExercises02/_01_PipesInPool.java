package ConditionalStatementsMoreExercises02;

import java.util.Scanner;

public class _01_PipesInPool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double firstpipe = H * P1;
        double secondpipe = H * P2;
        double litersTotal = firstpipe + secondpipe;


        if (litersTotal <= V) {
            double percentamountliters = litersTotal / V * 100;
            double percentfirstpipe = firstpipe / litersTotal * 100;
            double percentsecondpipe = secondpipe / litersTotal * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentamountliters, percentfirstpipe, percentsecondpipe);

        }else {
            double literswaterexcess = litersTotal - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, literswaterexcess);
        }
    }
}
