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
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            long a = 0;
            long b = 1;
            long result = 0;
            if (P == 0) result = a;
            else if (P == 1) result = b;
            else {
                for (int j = 2; j <= P; j++) {
                    result = (a + b) % Q;
                    a = b;
                    b = result;
                }
            }
            bw.write("Case #" + i + ": " + (P == 0 ? a % Q : b % Q) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}