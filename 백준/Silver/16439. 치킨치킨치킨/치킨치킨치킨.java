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
        int M = Integer.parseInt(st.nextToken());
        int[][] preference = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                preference[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxTotal = 0;
        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < M; j++) {
                for (int k = j + 1; k < M; k++) {
                    int sum = 0;
                    for (int m = 0; m < N; m++) {
                        int best = Math.max(preference[m][i], Math.max(preference[m][j], preference[m][k]));
                        sum += best;
                    }
                    maxTotal = Math.max(maxTotal, sum);
                }
            }
        }
        bw.write(maxTotal + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}