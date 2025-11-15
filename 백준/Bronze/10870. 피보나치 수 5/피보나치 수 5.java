import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        if (n == 0) dp[n] = 0;
        if (n == 1) dp[n] = 1;
        if (n == 2) dp[n] = 1;
        for (int i = 3; i <= n; i++) {
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
        br.close();
    }
}