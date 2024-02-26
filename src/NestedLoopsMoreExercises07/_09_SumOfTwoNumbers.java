package NestedLoopsMoreExercises07;

import java.util.Scanner;

public class _09_SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int firstNum = 0;
        int secondNum = 0;
        boolean MagicalNum = false;

        for (firstNum = startInterval; firstNum <= endInterval; firstNum++) {

            for (secondNum = startInterval; secondNum <= endInterval; secondNum++) {

                counter++;

                if (firstNum + secondNum == magicNumber) {
                    MagicalNum = true;
                    break;
                }
            }
            if (MagicalNum) {
                break;
            }
        }
        if (MagicalNum) {

            System.out.printf("Combination N:%d (%d + %d = %d)", counter, firstNum, secondNum, magicNumber);

        }else {

            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);

                }
            }
        }





