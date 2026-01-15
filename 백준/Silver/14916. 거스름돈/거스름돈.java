import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n > 1) {
            if (n % 5 == 0) {
                cnt += n / 5;
                n %= 5;
            }
            if (n <= 1) break;
            n -= 2;
            cnt++;
        }
        if (n == 1) {
            bw.write(String.valueOf("-1"));
        } else {
            bw.write(String.valueOf(cnt));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}