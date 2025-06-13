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
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            bw.write(6 * T + 3 * F + 2 * S + P + 2 * C + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}