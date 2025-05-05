import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(br.readLine());
        long[] dpA = new long[Math.max(K + 1, 3)];
        long[] dpB = new long[Math.max(K + 1, 3)];
        dpA[1] = 0;
        dpA[2] = 1;
        dpB[1] = 1;
        dpB[2] = 1;
        for (int i = 3; i <= K; i++) {
            dpA[i] = dpA[i - 1] + dpA[i - 2];
        }
        for (int i = 3; i <= K; i++) {
            dpB[i] = dpB[i - 1] + dpB[i - 2];
        }
        bw.write(dpA[K] + " " + dpB[K] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}