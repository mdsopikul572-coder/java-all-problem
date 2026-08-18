public class Main {
    public static void main(String[] args) {

        int[] years = {2021, 2024, 2045, 2048};

        for (int year : years) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " = Leap Year");
            } else {
                System.out.println(year + " = Not Leap Year");
            }
        }
    }
}