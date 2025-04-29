import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int MOD = 1_000_000_009;
    static int MAX_N = 1000;
    static int[][] dp = new int[MAX_N + 1][MAX_N + 1];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dp[0][0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            for (int j = 1; j <= MAX_N; j++) {
                if (i >= 1) dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                if (i >= 2) dp[i][j] = (dp[i][j] + dp[i - 2][j - 1]) % MOD;
                if (i >= 3) dp[i][j] = (dp[i][j] + dp[i - 3][j - 1]) % MOD;
            }
        }
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            bw.write(dp[n][m] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}