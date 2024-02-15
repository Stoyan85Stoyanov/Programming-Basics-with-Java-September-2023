package WhileLoopExercise05;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String theBookOfAnnie = scanner.nextLine();

        int checkedBooks = 0;


        String book = scanner.nextLine();


        while (!book.equals(theBookOfAnnie)) {

            if (book.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", checkedBooks);
                return;
            }

            checkedBooks++;


            book = scanner.nextLine();
        }

        System.out.printf("You checked %d books and found it.", checkedBooks);
    }
}