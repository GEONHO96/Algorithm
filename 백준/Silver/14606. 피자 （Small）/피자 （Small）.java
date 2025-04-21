import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= N; i++) {
            dp[i] = i * (i - 1) / 2;
        }
        bw.write(dp[N] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}