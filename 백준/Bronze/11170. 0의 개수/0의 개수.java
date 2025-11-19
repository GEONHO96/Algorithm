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
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i = N; i <= M; i++) {
                String S = String.valueOf(i);
                int length = S.length();
                for (int j = 0; j < length; j++) {
                    if (S.charAt(j) == '0') cnt++;
                }
            }
            bw.write(String.valueOf(cnt) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}