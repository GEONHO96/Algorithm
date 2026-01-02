import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int x = Integer.parseInt(br.readLine());
            long[] F = new long[x + 1];
            if (x == 0) F[x] = 1;
            if (x == 1) F[x] = 1;
            for (int i = 0; i <= x; i++) {
                if (i == 0) F[i] = 1;
                else if (i == 1) F[i] = 1;
                else F[i] = F[i - 1] + F[i - 2];
            }
            bw.write(String.valueOf(F[x]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}