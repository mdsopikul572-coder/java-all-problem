import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        checkPerfect(n1);
        checkPerfect(n2);
    }

    static void checkPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++)
            if (n % i == 0)
                sum += i;

        if (sum == n)
            System.out.println(n + " is Perfect");
        else
            System.out.println(n + " is Not Perfect");
    }
}