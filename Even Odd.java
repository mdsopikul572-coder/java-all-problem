public class Main {
    public static void main(String[] args) {

        int[] numbers = {12, 32, 67, 80, 14, 25, 26, 72, 73, 64, 8};

        System.out.println("Even numbers:");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int n : numbers) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
    }
}