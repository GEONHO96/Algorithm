import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int digit = Integer.parseInt(br.readLine());
            sb.append(digit);
        }
        if ((sb.charAt(0) == '8' || sb.charAt(0) == '9') && (sb.charAt(3) == '8' || sb.charAt(3) == '9') && (sb.charAt(1) == sb.charAt(2))) {
            bw.write("ignore");
        } else {
            bw.write("answer");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}