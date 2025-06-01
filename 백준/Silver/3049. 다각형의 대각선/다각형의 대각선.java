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
        int ans = 0;
        if (N == 3) bw.write("0\n");
        else if (N >= 4) {
            ans = (N * (N - 1) * (N - 2) * (N - 3)) / 24;
            bw.write(ans + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}