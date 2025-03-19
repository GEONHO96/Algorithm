import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] boxes = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            boxes[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxCount = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (boxes[i] > boxes[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                maxCount = Math.max(maxCount, dp[i]);
            }
        }
        bw.write(maxCount + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}