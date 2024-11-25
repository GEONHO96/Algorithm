import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] dp = new long[81];
        dp[1] = 4;
        dp[2] = 6;
        for (long i = 3; i <= N; i++) {
            dp[(int) i] = dp[(int) i - 2] + dp[(int) i - 1];
        }
        System.out.println(dp[(int) N]);
    }
}