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
        int[] a = new int[N];
        int maxProfit = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int minPrice = a[0];
        for (int i = 1; i < N; i++) {
            maxProfit = Math.max(maxProfit, a[i] - minPrice);
            minPrice = Math.min(minPrice, a[i]);
        }
        bw.write(String.valueOf(maxProfit));
        bw.flush();
        bw.close();
        br.close();
    }
}