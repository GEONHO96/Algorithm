import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int length = String.valueOf(N).length();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < length; i++) {
            if (i < length / 2) {
                sum1 += Integer.parseInt(String.valueOf(String.valueOf(N).charAt(i)));
            } else {
                sum2 += Integer.parseInt(String.valueOf(String.valueOf(N).charAt(i)));
            }
        }
        if (sum1 == sum2) {
            bw.write("LUCKY");
        } else {
            bw.write("READY");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}