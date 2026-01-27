import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String S = br.readLine();
            int num = 0;
            for (int i = 0; i < 24; i++) {
                if (S.charAt(i) == '1') num += (int) Math.pow(2, 23 - i);
            }
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}