import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int length = S.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'a') sb.append("4");
            else if (S.charAt(i) == 'e') sb.append("3");
            else if (S.charAt(i) == 'i') sb.append("1");
            else if (S.charAt(i) == 'o') sb.append("0");
            else if (S.charAt(i) == 's') sb.append("5");
            else sb.append(S.charAt(i));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}