import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long seconds = 1;
        for (int i = N; i >= 1; i--) {
            seconds *= i;
        }
        long weeks = seconds / (7 * 24 * 60 * 60);
        System.out.println(weeks);
    }
}