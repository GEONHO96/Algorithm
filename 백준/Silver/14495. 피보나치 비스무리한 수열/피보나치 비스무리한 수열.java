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
        long[] dp = new long[n + 1];
        if (n == 0) dp[n] = 1;
        if (n == 1) dp[n] = 1;
        if (n == 2) dp[n] = 1;
        for (int i = 0; i <= n; i++) {
            if (i == 0) dp[i] = 1;
            else if (i == 1) dp[i] = 1;
            else if (i == 2) dp[i] = 1;
            else dp[i] = dp[i - 1] + dp[i - 3];
        }
        bw.write(String.valueOf(dp[n - 1]));
        bw.flush();
        bw.close();
        br.close();
    }
}