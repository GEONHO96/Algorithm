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
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int maxLen = 1;
        int upLen = 1;
        int downLen = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                upLen++;
                downLen = 1;
            } else if (arr[i] < arr[i - 1]) {
                downLen++;
                upLen =1;
            } else {
                upLen++;
                downLen++;
            }
            maxLen = Math.max(maxLen, Math.max(upLen, downLen));
        }
        bw.write(maxLen + "\n");
        bw.flush();
        bw.close();
    }
}