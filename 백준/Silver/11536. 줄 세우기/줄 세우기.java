import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        String[] newStr1 = new String[N];
        String[] newStr2 = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
            newStr1[i] = str[i];
            newStr2[i] = str[i];
        }
        Arrays.sort(newStr1);
        Arrays.sort(newStr2, Collections.reverseOrder());
        if (Arrays.equals(str, newStr1)) bw.write("INCREASING");
        else if (Arrays.equals(str, newStr2)) bw.write("DECREASING");
        else bw.write("NEITHER");
        bw.flush();
        bw.close();
        br.close();
    }
}