import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int length = S.length();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= length - i - 1; j++) {
                set.add(S.substring(i, i + j + 1));
            }
        }
        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}