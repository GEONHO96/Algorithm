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
        String str = "SciComLove";
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        if (N % 2 == 1) {
            for (int i = length - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            bw.write(String.valueOf(sb));
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(str.charAt(i));
            }
            bw.write(String.valueOf(sb));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}