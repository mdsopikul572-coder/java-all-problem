public class Main {
    public static void main(String[] args) {

        for (int n = 1; n <= 5; n++) {
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println(n + "! = " + fact);
        }
    }
}