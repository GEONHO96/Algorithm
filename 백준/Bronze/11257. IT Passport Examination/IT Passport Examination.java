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
        while (N-- > 0) {
            String[] input = br.readLine().split(" ");
            int information = Integer.parseInt(input[0]);
            int strategy = Integer.parseInt(input[1]);
            int management = Integer.parseInt(input[2]);
            int technology = Integer.parseInt(input[3]);
            int sum = strategy + management + technology;
            bw.write(information + " ");
            if (sum >= 55 && strategy >= 35 * 0.3 && management >= 25 * 0.3 && technology >= 40 * 0.3) {
                bw.write(sum + " " + "PASS\n");
            } else {
                bw.write(sum + " " + "FAIL\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}