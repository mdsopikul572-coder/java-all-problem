import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
