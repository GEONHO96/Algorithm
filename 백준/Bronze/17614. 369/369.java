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
        for (int i = 1; i <= N; i++) {
            String S = String.valueOf(i);
            int length = S.length();
            for (int j = 0; j < length; j++) {
                if (S.charAt(j) == '3' || S.charAt(j) == '6' || S.charAt(j) == '9') cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}