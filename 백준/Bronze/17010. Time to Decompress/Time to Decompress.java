import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        while (L-- > 0) {
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]);
            char x = split[1].charAt(0);
            for (int i = 0; i < N; i++) {
                bw.write(x);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}