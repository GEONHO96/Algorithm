import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int length = input.length();
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == 'e') cnt++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));
        for (int i = 0; i < 2 * cnt; i++) {
            sb.append('e');
        }
        sb.append(input.charAt(length - 1));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}