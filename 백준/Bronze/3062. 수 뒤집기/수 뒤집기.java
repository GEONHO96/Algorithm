import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String num = String.valueOf(N);
            String reverseNum = "";
            for (int i = num.length() - 1; i >= 0; i--) {
                reverseNum += num.charAt(i);
            }
            int M = N + Integer.parseInt(reverseNum);
            String newNum = String.valueOf(M);
            boolean satisfied = true;
            for (int i = 0; i < newNum.length(); i++) {
                if (newNum.charAt(i) != newNum.charAt(newNum.length() - 1 - i)) satisfied = false;
            }
            if (satisfied) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}