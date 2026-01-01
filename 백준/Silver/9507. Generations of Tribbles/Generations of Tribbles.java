import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] koong = new long[n + 1];
            if (n == 0) koong[n] = 1;
            if (n == 1) koong[n] = 1;
            if (n == 2) koong[n] = 2;
            if (n == 3) koong[n] = 4;
            for (int i = 0; i <= n; i++) {
                if (i == 0) koong[i] = 1;
                else if (i == 1) koong[i] = 1;
                else if (i == 2) koong[i] = 2;
                else if (i == 3) koong[i] = 4;
                else {
                    koong[i] = koong[i - 1] + koong[i - 2] + koong[i - 3] + koong[i - 4];
                }
            }
            bw.write(String.valueOf(koong[n]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}