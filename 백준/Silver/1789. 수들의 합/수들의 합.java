import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long S = Long.parseLong(br.readLine());
        int N = 1;
        while (S > 0) {
            N++;
            S -= N;
        }
        bw.write(String.valueOf(N - 1));
        bw.flush();
        bw.close();
        br.close();
    }
}