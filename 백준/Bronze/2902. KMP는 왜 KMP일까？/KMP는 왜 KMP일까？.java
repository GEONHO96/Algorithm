import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentence = br.readLine();
        String[] parts = sentence.split("-");
        int n = parts.length;
        for (int i = 0; i < n; i++) {
            bw.write(parts[i].charAt(0));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}