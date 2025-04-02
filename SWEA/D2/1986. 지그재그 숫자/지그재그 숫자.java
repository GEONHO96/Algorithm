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
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            int num = Integer.parseInt(br.readLine());
            for (int j = 1; j <= num; j++) {
                if (j % 2 == 0) sum -= j;
            	else sum += j;
            }
            bw.write("#" + i + " ");
            bw.write(String.valueOf(sum + "\n"));
        }        
        bw.flush();
        bw.close();
        br.close();
    }
}