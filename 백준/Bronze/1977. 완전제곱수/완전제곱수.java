import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int cnt = 0;
        for (int i = M; i <= N; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                cnt++;
                sum += i;
                min = Math.min(min, i);
            }
        }
        if (cnt > 0) bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
        else bw.write("-1");
        bw.flush();
        bw.close();
        br.close();
    }
}