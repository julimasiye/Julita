import java.util.Scanner;

class validinteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.print("Please enter an integer value between 5 and 10: ");
            num = scanner.nextInt();

            if (num >= 5 && num <= 10) {
                break;
            } else {
                System.out.println("Wrong value entered. Please enter an integer value between 5 and 10 ?");
            }
        }

        System.out.println("Your input value " + num + " has been accepted.");
        scanner.close();
    }
}
