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
            String password = br.readLine();
            if (password.equals("END")) break;
            int n = password.length();
            String S = "";
            for (int i = n - 1; i >= 0; i--) {
                S += password.charAt(i);
            }
            bw.write(S + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}