package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _09_WeatherForecast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        if (weather.equals("sunny")) {
            System.out.println("It's warm outside!");

        }else {
            System.out.println("It's cold outside!");
        }
    }
}
