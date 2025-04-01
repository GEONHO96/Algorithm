import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] citations = new int[n];
        for (int i = 0; i < n; i++) {
            citations[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(citations);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                count++;
            }
        }
        bw.write(String.valueOf(count) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}