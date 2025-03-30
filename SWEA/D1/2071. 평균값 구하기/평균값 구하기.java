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
            int[] arr = new int[10];
            int sum = 0;
            double avg = 0.0;
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            avg = sum / 10.0;
            bw.write("#" + i + " " + Math.round(avg) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}