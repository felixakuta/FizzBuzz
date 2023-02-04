import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean enterAnotherNumber = true;
        while (enterAnotherNumber == true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Number: ");

            int number = scanner.nextInt();
            if (number % 3 == 0 && number % 5 == 0)
                System.out.println("FizzBuzz");
            else if (number % 5 == 0 && number % 10 == 0)
                System.out.println("Fizz");
            else if (number % 3 == 0)
                System.out.println("Buzz");
            else
                System.out.println(number);

            System.out.println("Enter 1 to input another number, otherwise enter 2");
            int user1 = scanner.nextInt();
            if (user1 == 1)
                enterAnotherNumber = true;
            else
                enterAnotherNumber = false;

        }

    }
}