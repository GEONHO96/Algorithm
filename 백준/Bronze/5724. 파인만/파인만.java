import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int cnt = 1;
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            if (N == 1) cnt = 1;
            else {
                for (int i = 2; i <= N; i++) {
                    cnt = cnt + i * i;
                }
            }
            bw.write(String.valueOf(cnt) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}