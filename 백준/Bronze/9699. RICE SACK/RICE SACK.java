import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int x = 1; x <= N; x++) {
            Integer[] arr = new Integer[5];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int y = 0; y < 5; y++) {
                arr[y] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, Collections.reverseOrder());
            bw.write("Case #" + x + ": " + arr[0] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}