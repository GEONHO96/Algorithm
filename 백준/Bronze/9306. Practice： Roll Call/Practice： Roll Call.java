import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String First = br.readLine();
            String Last = br.readLine();
            bw.write("Case " + i + ": " + Last + ", " + First + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}