package ProgrammingBasicsOnlineExam_6and7April2019;

import java.util.Scanner;

public class _05_MovieRatings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int filmsNumber = Integer.parseInt(scanner.nextLine());

        double maxRating = 0;
        double minRating = 11;
        double sumRating = 0;
        String highestRatingForFilm = "";
        String lowestRatingForFilm = "";

        for (int counter = 1; counter <= filmsNumber; counter++) {
            String filmName = scanner.nextLine();
            double filmRating = Double.parseDouble(scanner.nextLine());

            if (filmRating > maxRating) {
                maxRating = filmRating;
                highestRatingForFilm = filmName;
            }

            if (filmRating < minRating) {
                minRating = filmRating;
                lowestRatingForFilm = filmName;
            }
            sumRating += filmRating;
        }

        double averageRating = sumRating / filmsNumber;

        System.out.printf("%s is with highest rating: %.1f%n", highestRatingForFilm, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lowestRatingForFilm, minRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
