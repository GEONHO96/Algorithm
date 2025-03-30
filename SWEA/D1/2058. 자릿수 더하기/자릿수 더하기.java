import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String S = String.valueOf(N);
        int len = S.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(String.valueOf(S.charAt(i)));
        }
        bw.write(String.valueOf(sum) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}