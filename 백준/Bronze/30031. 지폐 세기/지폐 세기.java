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
        int totalPrice = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            if (width == 136 && length == 68) totalPrice += 1000;
            if (width == 142 && length == 68) totalPrice += 5000;
            if (width == 148 && length == 68) totalPrice += 10000;
            if (width == 154 && length == 68) totalPrice += 50000;
        }
        bw.write(String.valueOf(totalPrice));
        bw.flush();
        bw.close();
        br.close();
    }
}