import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int length = str.length();
        int cnt = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < length; j++) {
                if ("MOBIS".charAt(i) == str.charAt(j)) {
                    cnt--;
                    break;
                }
            }
        }
        if (cnt <= 0) bw.write("YES");
        else bw.write("NO");
        bw.flush();
        bw.close();
        br.close();
    }
}