import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            String S = String.valueOf(N);
            int length = S.length();
            int width = length + 1;
            for (int i = 0; i < length; i++) {
                if (S.charAt(i) == '0') width += 4;
                else if (S.charAt(i) == '1') width += 2;
                else width += 3;
            }
            bw.write(width + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}