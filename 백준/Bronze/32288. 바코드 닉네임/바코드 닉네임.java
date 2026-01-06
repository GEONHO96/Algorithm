import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String S = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'I') sb.append("i");
            if (S.charAt(i) == 'l') sb.append("L");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}