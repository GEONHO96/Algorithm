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
        int sum = 0;
        int[] scores = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        int[] newScores = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (scores[i] == 0) newScores[i] = 0;
                if (scores[i] == 1) newScores[i] = 1;
            } else {
                if (scores[i - 1] == 0 && scores[i] == 1) {
                    newScores[i] = 1;
                } else if (scores[i - 1] == 1 && scores[i] == 1) {
                    newScores[i] = newScores[i - 1] + 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            sum += newScores[i];
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}