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
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] raindrop = new int[W];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < W; i++) {
            raindrop[i] = Integer.parseInt(st.nextToken());
        }
        int amounts = 0;
        for (int i = 0; i < W - 1; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, raindrop[j]);
            }
            for (int j = i + 1; j < W; j++) {
                rightMax = Math.max(rightMax, raindrop[j]);
            }
            int minHeight = Math.min(leftMax, rightMax);
            if (minHeight > raindrop[i]) {
                amounts += minHeight - raindrop[i];
            }
        }
        bw.write(amounts + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}