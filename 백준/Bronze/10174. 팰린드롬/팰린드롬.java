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
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int length = str.length();
            boolean satisfied = true;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
                    sb.append(Character.toUpperCase(str.charAt(j)));
                } else {
                    sb.append(str.charAt(j));
                }
            }
            for (int j = 0; j < length; j++) {
                if (sb.charAt(j) != sb.charAt(length - 1 - j)) {
                    satisfied = false;
                    break;
                }
            }
            if (satisfied) bw.write("Yes\n");
            else bw.write("No\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}