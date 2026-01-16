import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int length = S.length();
        String[] str = new String[length];
        for (int i = 0; i < length; i++) {
            str[i] = S.substring(i, length);
        }
        Arrays.sort(str);
        for (int i = 0; i < length; i++) {
            bw.write(str[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}