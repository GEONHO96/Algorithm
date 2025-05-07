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
        int i = 0;
        boolean isValid = true;
        while (S.length() > i) {
            if (i + 1 < S.length() && S.substring(i, i + 2).equals("pi")) {
                i += 2;
            } else if (i + 1 < S.length() && S.substring(i, i + 2).equals("ka")) {
                i += 2;
            } else if (i + 2 < S.length() && S.substring(i, i + 3).equals("chu")) {
                i += 3;
            } else {
                isValid = false;
                break;
            }
        }
        bw.write(isValid ? "YES\n" : "NO\n");
        bw.flush();
        bw.close();
        br.close();
    }
}