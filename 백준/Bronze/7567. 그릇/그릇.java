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
        int height = 10;
        for (int i = 0; i < length - 1; i++) {
            if (S.charAt(i) == '(' && S.charAt(i + 1) == '(') height += 5;
            if (S.charAt(i) == '(' && S.charAt(i + 1) == ')') height += 10;
            if (S.charAt(i) == ')' && S.charAt(i + 1) == ')') height += 5;
            if (S.charAt(i) == ')' && S.charAt(i + 1) == '(') height += 10;
        }
        bw.write(String.valueOf(height));
        bw.flush();
        bw.close();
        br.close();
    }
}