import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] dp0 = new int[Math.max(N + 1, 3)];
            int[] dp1 = new int[Math.max(N + 1, 3)];
            dp0[0] = 1;
            dp1[0] = 0;
            dp0[1] = 0;
            dp1[1] = 1;
            dp0[2] = 1;
            dp1[2] = 1;
            for (int i = 3; i <= N; i++) {
                dp0[i] = dp0[i - 2] + dp0[i - 1];
                dp1[i] = dp1[i - 2] + dp1[i - 1];
            }
            bw.write(dp0[N] + " " + dp1[N] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}