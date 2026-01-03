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
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }
        int cnt = 10;
        while (cnt-- > 0) {
            int temp = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int i = a - 1; i < (a + b - 1) / 2; i++) {
                temp = arr[i];
                arr[i] = arr[a + b - 2 - i];
                arr[a + b - 2 - i] = temp;
            }
        }
        for (int i = 0; i < 20; i++) {
            bw.write(String.valueOf(arr[i]) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}