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
        for (int i = 1; i <= N; i++) {
            if (i % 6 != 0 && i != N) {
                bw.write(i + " ");
            } else if (i % 6 == 0) {
                bw.write(i + " Go! ");
            } else if (i == N) {
                bw.write(i + " Go! ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}