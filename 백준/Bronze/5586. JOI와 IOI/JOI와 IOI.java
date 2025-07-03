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
        int IOICount = 0;
        int JOICount = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            if (S.charAt(i) == 'I' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
                IOICount++;
            }
            if (S.charAt(i) == 'J' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
                JOICount++;
            }
        }
        bw.write(JOICount + "\n" + IOICount);
        bw.flush();
        bw.close();
        br.close();
    }
}