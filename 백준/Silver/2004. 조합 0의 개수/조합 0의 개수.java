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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count2 = countFactor(n, 2) - countFactor(m, 2) - countFactor(n - m, 2);
        int count5 = countFactor(n, 5) - countFactor(m, 5) - countFactor(n - m, 5);
        bw.write(String.valueOf(Math.min(count2, count5)));
        bw.flush();
        bw.close();
        br.close();
    }
    static int countFactor(int n, int factor) {
        int count = 0;
        while (n >= factor) {
            count += n / factor;
            n /= factor;
        }
        return count;
    }
}