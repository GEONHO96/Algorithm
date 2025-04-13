import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] scores = new int[8];
        int[] copyOfScores = new int[8];
        for (int i = 0; i < 8; i++) {
            scores[i] = Integer.parseInt(br.readLine());
            copyOfScores[i] = scores[i];
        }
        Arrays.sort(scores);
        int sum = scores[3] + scores[4] + scores[5] + scores[6] + scores[7];
        bw.write(sum + "\n");
        List<Integer> list = new ArrayList<>();
        for (int i = 3; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (scores[i] == copyOfScores[j]) {
                    list.add(j + 1);
                }
            }
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}