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
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int cnt1 = 0;
        int cnt2 = 0;
        if (N % A != 0) {
            cnt1 = N / A + 1;
        } else {
            cnt1 = N / A;
        }
        if (N % C != 0) {
            cnt2= N / C + 1;
        } else {
            cnt2 = N / C;
        }
        int minSum = Math.min(cnt1 * B, cnt2 * D);
        bw.write(String.valueOf(minSum));
        bw.flush();
        bw.close();
        br.close();
    }
}