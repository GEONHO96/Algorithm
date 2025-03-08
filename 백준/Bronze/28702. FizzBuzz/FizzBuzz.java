import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();
        int n = 0;
        if (isNumeric(first)) {
            n = Integer.parseInt(first);
        } else if (isNumeric(second)) {
            n = Integer.parseInt(second) - 1;
        } else if (isNumeric(third)) {
            n = Integer.parseInt(third) - 2;
        }
        System.out.println(fizzBuzz(n + 3));
        sc.close();
    }
    public static String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}