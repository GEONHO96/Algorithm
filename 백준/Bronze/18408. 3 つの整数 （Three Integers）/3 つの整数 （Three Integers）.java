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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[]{A, B, C};
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == 1) cnt1++;
            if (arr[i] == 2) cnt2++;
        }
        if (cnt1 > cnt2) bw.write("1\n");
        if (cnt1 < cnt2) bw.write("2\n");
        bw.flush();
        bw.close();
        br.close();
    }
}