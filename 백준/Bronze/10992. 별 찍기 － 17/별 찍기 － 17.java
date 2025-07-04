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
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                for (int j = 0; j < 2 * N - 1; j++) {
                    bw.write("*");
                }
            } else {
                for (int j = 0; j < N - i - 1; j++) {
                    bw.write(" ");
                }
                bw.write("*");
                if (i != 0) {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        bw.write(" ");
                    }
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}