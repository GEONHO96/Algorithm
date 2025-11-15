import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            for (int i = 1; i <= N; i++) {
                if (i == 1) cnt = 1;
                else {
                    cnt += i * i;
                }
            }
            bw.write(String.valueOf(cnt) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}