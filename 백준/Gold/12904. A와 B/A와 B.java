import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        String T = br.readLine();
        StringBuilder sb = new StringBuilder(T);
        while (sb.length() > S.length()) {
            if (sb.charAt(sb.length() - 1) == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            } else if (sb.charAt(sb.length() - 1) == 'B') {
                sb.deleteCharAt(sb.length() - 1);
                sb.reverse();
            }
        }
        if (sb.toString().equals(S)) {
            bw.write(1 + "\n");
        } else {
            bw.write(0 + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}