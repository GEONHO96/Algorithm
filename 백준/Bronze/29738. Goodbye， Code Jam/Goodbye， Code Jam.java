import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N > 4500) bw.write("Case #" + i + ": " + "Round 1\n");
            else if (N > 1000) bw.write("Case #" + i + ": " + "Round 2\n");
            else if (N > 25) bw.write("Case #" + i + ": " + "Round 3\n");
            else bw.write("Case #" + i + ": " + "World Finals\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}