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
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < N; i++) {
                max = Math.max(max ,A[i]);
                min = Math.min(min, A[i]);
            }
            bw.write(min + " " + max + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}