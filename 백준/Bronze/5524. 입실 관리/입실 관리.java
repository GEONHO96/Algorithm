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
        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            int length = S.length();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if (Character.isUpperCase(S.charAt(j))) sb.append(Character.toLowerCase(S.charAt(j)));
                else sb.append(S.charAt(j));
            }
            bw.write(sb + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}