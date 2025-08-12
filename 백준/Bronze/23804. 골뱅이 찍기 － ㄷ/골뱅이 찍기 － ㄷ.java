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
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < 5 * N; k++) {
                        bw.write("@");
                    }
                    bw.write("\n");
                }
            } else {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        bw.write("@");
                    }
                    bw.write("\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}