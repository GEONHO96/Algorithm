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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int minCount = Integer.MAX_VALUE;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        int[] newA = new int[N];
        for (int i = 0; i < N; i++) {
            newA[i] = A[N - 1 - i];
        }
        while (K > 0) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (K / newA[i] > 0) {
                    count += K / newA[i];
                    K %= newA[i];
                }
            }
            minCount = Math.min(minCount, count);
        }
        bw.write(minCount + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}