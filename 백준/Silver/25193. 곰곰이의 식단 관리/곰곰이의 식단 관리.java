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
        String S = br.readLine();
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'C') c++;
        }
        int o = N - c;
        int slots = o + 1;
        int ans = (c + slots - 1) / slots;
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}