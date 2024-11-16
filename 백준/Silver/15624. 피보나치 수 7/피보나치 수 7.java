import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] dp = new long[1000001];
        dp[0] = 0;
        dp[1] = 1;
        for (long i = 2; i <= n; i++) {
            dp[(int)i] = (dp[(int)(i - 1)] + dp[(int)(i - 2)]) % 1000000007;
        }
        System.out.println(dp[(int)n]);
    }
}