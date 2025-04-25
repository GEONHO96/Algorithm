import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long L = Long.parseLong(st.nextToken());
            long U = Long.parseLong(st.nextToken());
            long X = Long.parseLong(st.nextToken());
            long minutes = 0;
            if (X <= L) {
                minutes = L - X;
            } else if (L < X && X <= U) {
                minutes = 0;
            } else {
                minutes = -1;
            }
            bw.write("#" + i + " " + minutes + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}