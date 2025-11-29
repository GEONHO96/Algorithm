import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        long max = 0;
        long[] dp = new long[N];
        for (int i = 0; i < N; i++) {
            dp[i] = A[i];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] < A[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + A[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}