package ProgrammingBasicsOnlineExam_15and16June2019;

import java.util.Scanner;

public class _01_SeriesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int seasonsCount = Integer.parseInt(scanner.nextLine());
        int episodesCount = Integer.parseInt(scanner.nextLine());
        double episodeTime = Double.parseDouble(scanner.nextLine());

        double advertisementTime = episodeTime * 0.2;

        double episodeTimeWithAdvertisement = episodeTime + advertisementTime;

        double totalTime = episodeTimeWithAdvertisement * episodesCount * seasonsCount + (seasonsCount * 10);

        System.out.println(String.format("Total time needed to watch the %s series is %.0f minutes.",
                serialName, Math.floor(totalTime)));

        }
}
