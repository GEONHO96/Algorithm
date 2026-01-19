import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        long D = (long) A * B * C;
        String E = String.valueOf(D);
        int length = E.length();
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        int cnt5 = 0;
        int cnt6 = 0;
        int cnt7 = 0;
        int cnt8 = 0;
        int cnt9 = 0;
        for (int i = 0; i < length; i++) {
            if (E.charAt(i) == '0') cnt0++;
            if (E.charAt(i) == '1') cnt1++;
            if (E.charAt(i) == '2') cnt2++;
            if (E.charAt(i) == '3') cnt3++;
            if (E.charAt(i) == '4') cnt4++;
            if (E.charAt(i) == '5') cnt5++;
            if (E.charAt(i) == '6') cnt6++;
            if (E.charAt(i) == '7') cnt7++;
            if (E.charAt(i) == '8') cnt8++;
            if (E.charAt(i) == '9') cnt9++;
        }
        bw.write(cnt0 + "\n");
        bw.write(cnt1 + "\n");
        bw.write(cnt2 + "\n");
        bw.write(cnt3 + "\n");
        bw.write(cnt4 + "\n");
        bw.write(cnt5 + "\n");
        bw.write(cnt6 + "\n");
        bw.write(cnt7 + "\n");
        bw.write(cnt8 + "\n");
        bw.write(cnt9 + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}