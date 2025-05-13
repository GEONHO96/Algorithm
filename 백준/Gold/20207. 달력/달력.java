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
        int[] calendar = new int[367];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            for (int j = S; j <= E; j++) {
                calendar[j]++;
            }
        }
        int totalArea = 0;
        int height = 0;
        int width = 0;
        for (int i = 1; i <= 366; i++) {
            if (calendar[i] > 0) {
                height = Math.max(height, calendar[i]);
                width++;
            } else {
                totalArea += height * width;
                height = 0;
                width = 0;
            }
        }
        bw.write(totalArea + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}