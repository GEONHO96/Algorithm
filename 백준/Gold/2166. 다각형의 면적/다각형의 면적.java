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
        long[] x = new long[N];
        long[] y = new long[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Long.parseLong(st.nextToken());
            y[i] = Long.parseLong(st.nextToken());
        }
        double area = 0;
        for (int i = 0; i < N; i++) {
            area += (x[i] * y[(i + 1) % N]) - (x[(i + 1) % N] * y[i]);
        }
        area = Math.abs(area) / 2.0;
        bw.write(String.format("%.1f", area));
        bw.flush();
        bw.close();
        br.close();
    }
}