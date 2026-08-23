import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        System.out.println("Largest number = " + largest);
    }
}