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
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            if (Math.sqrt(N) % 1 == 0) bw.write("1\n");
            else bw.write("0\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}