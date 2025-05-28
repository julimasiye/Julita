import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int j = scanner.nextInt();

            if (j  % 3 == 0 && j % 5 == 0) {
                System.out.println("Output: FizzBuzz");
            } else if (j % 3 == 0) {
                System.out.println("Output: Fizz");
            } else if (j % 5 == 0) {
                System.out.println("Output: Buzz");
            } else {
                System.out.println("entered wrong value.Please try again later.thank you!");
                break;
            }
        }

        scanner.close();
    }
}
