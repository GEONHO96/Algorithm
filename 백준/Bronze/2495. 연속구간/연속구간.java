import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            String S = String.valueOf(num);
            int length = S.length();
            int len = 1;
            int max = 0;
            for (int j = 0; j < length - 1; j++) {
                if (S.charAt(j) == S.charAt(j + 1)) len++;
                else len = 1;
                max = Math.max(max, len);
            }
            bw.write(max + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}