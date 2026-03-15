import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == 'C' || word.charAt(i) == 'A' || word.charAt(i) == 'M' || word.charAt(i) == 'B' || word.charAt(i) == 'R' || word.charAt(i) == 'I' || word.charAt(i) == 'R' || word.charAt(i) == 'D' || word.charAt(i) == 'G' || word.charAt(i) == 'E') {
                continue;
            } else {
                sb.append(word.charAt(i));
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}