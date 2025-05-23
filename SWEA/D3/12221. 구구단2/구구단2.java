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
        int TC = Integer.parseInt(br.readLine());
        for (int i = 1; i <= TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if ((1 <= A && A <= 9) && (1 <= B && B <= 9)) {
                int C = A * B;
                bw.write("#" + i + " " + C + "\n");
            } else {
                bw.write("#" + i + " " + -1 + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}