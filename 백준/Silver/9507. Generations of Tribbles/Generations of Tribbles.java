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
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) bw.write(1 + "\n");
            if (n == 1) bw.write(1 + "\n");
            if (n == 2) bw.write(2 + "\n");
            if (n == 3) bw.write(4 + "\n");
            if (n >= 4) {
                long[] koong = new long[n + 1];
                koong[0] = 1;
                koong[1] = 1;
                koong[2] = 2;
                koong[3] = 4;
                for (int j = 4; j <= n; j++) {
                    koong[j] = koong[j - 1] + koong[j - 2] + koong[j - 3] + koong[j - 4];
                }
                bw.write(koong[n] + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}