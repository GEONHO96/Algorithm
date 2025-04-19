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
        int N = Integer.parseInt(br.readLine());
        long[] solution = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            solution[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(solution);
        long a = 0, b = 0, c = 0;
        long minAbsSum = Long.MAX_VALUE;
        for (int i = 0; i < N - 2; i++) {
            int left = i + 1;
            int right = N - 1;
            while (left < right) {
                long sum = solution[i] + solution[left] + solution[right];
                if (Math.abs(sum) < minAbsSum) {
                    minAbsSum = Math.abs(sum);
                    a = solution[i];
                    b = solution[left];
                    c = solution[right];
                }
                if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        bw.write(a + " " + b + " " + c + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}