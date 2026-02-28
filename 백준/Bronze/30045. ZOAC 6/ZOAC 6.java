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
        int cnt = 0;
        while (N-- > 0) {
            String S = br.readLine();
            int length = S.length();
            for (int i = 0; i < length - 1; i++) {
                if (S.substring(i, i + 2).equals("01") || S.substring(i, i + 2).equals("OI")) {
                    cnt++;
                    break;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}