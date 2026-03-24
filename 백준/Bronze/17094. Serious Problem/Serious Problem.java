import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '2') cnt1++;
            else cnt2++;
        }
        if (cnt1 > cnt2) bw.write("2");
        else if (cnt1 == cnt2) bw.write("yee");
        else bw.write("e");
        bw.flush();
        bw.close();
        br.close();
    }
}