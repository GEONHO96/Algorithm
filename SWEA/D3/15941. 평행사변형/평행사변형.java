import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int TC = Integer.parseInt(br.readLine());
        for (int i = 1; i <= TC; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write("#" + i + " " + String.valueOf(N * N) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}