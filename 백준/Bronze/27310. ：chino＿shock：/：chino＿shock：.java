import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String emoji = br.readLine();
        int difficulty = 0;
        int length = emoji.length();
        int colonCnt = 0;
        int underBarCnt = 0;
        for (int i = 0; i < length; i++) {
            if (emoji.charAt(i) == ':') colonCnt++;
            if (emoji.charAt(i) == '_') underBarCnt++;
        }
        difficulty = length + colonCnt + underBarCnt * 5;
        bw.write(String.valueOf(difficulty));
        bw.flush();
        bw.close();
        br.close();
    }
}