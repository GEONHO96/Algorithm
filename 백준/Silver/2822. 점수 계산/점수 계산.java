import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] scores = new Integer[8];
        Integer[] duplicatedScores = new Integer[8];
        Integer[] top5Scores = new Integer[5];
        for (int i = 0; i < 8; i++) {
            scores[i] = Integer.parseInt(br.readLine());
            duplicatedScores[i] = scores[i];
        }
        Arrays.sort(scores, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += scores[i];
        }
        bw.write(sum + "\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (Objects.equals(scores[i], duplicatedScores[j])) {
                    top5Scores[i] = j + 1;
                }
            }
        }
        Arrays.sort(top5Scores);
        for (int i = 0; i < 5; i++) {
            bw.write(top5Scores[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}