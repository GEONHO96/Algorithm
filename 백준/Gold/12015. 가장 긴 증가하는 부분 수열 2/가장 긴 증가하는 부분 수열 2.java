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
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int[] lis = new int[N];
        int len = 0;
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = len;
            int x = A[i];
            while (left < right) {
                int mid = (left + right) / 2;
                if (lis[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            lis[left] = x;
            if (left == len) len++;
        }
        bw.write(String.valueOf(len));
        bw.flush();
        bw.close();
        br.close();
    }
}