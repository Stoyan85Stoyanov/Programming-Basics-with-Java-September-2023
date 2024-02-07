package WhileLoopLab05;

import java.util.Scanner;

public class _02_Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String currentPass = scanner.nextLine();

        while (!password.equals(currentPass)) {
            currentPass = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);

        }
    }

