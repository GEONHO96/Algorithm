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
            String sentence = br.readLine();
            int length = sentence.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i == 0) sb.append(Character.toUpperCase(sentence.charAt(i)));
                else sb.append(sentence.charAt(i));
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}