import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        StringBuilder newS = new StringBuilder();
        int length = S.length();
        char[] ch = new char[length];
        char[] newCh = new char[length];
        for (int i = 0; i < length; i++) {
            ch[i] = S.charAt(i);
            newCh[i] = S.charAt(i);
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            ch[A] = newCh[B];
            ch[B] = newCh[A];
            for (int j = 0; j < length; j++) {
                newCh[j] = ch[j];
            }
        }
        for (int i = 0; i < length; i++) {
            newS.append(ch[i]);
        }
        bw.write(newS.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}