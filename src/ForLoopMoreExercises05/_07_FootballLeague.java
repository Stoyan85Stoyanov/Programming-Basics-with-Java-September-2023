package ForLoopMoreExercises05;

import java.util.Scanner;

public class _07_FootballLeague {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityofthestadium = Integer.parseInt(scanner.nextLine());
        int numberofallfans = Integer.parseInt(scanner.nextLine());

        double aSector = 0;
        double bSector = 0;
        double vSector = 0;
        double gSector = 0;

        for (int i = 1; i <= numberofallfans; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    aSector++;
                    break;

                case "B":
                    bSector++;
                    break;

                case "V":
                    vSector++;
                    break;

                case "G":
                    gSector++;
                    break;

            }
        }

        double aFansPercent = aSector * 1 / numberofallfans * 100;
        double bFansPercent = bSector * 1 / numberofallfans * 100;
        double vFansPercent = vSector * 1 / numberofallfans * 100;
        double gFansPercent = gSector * 1 / numberofallfans * 100;
        double allFansPercent = numberofallfans * 1.0 / capacityofthestadium * 100;

        System.out.printf("%.2f%%%n", aFansPercent);
        System.out.printf("%.2f%%%n", bFansPercent);
        System.out.printf("%.2f%%%n", vFansPercent);
        System.out.printf("%.2f%%%n", gFansPercent);
        System.out.printf("%.2f%%%n", allFansPercent);

    }
}





