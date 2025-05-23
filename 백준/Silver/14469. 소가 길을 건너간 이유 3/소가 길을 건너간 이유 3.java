import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] cow = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cow[i][0] = Integer.parseInt(st.nextToken());
            cow[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cow, Comparator.comparing(a -> a[0]));
        int currentTime = 0;
        for (int i = 0; i < N; i++) {
            int arrival = cow[i][0];
            int inspect = cow[i][1];
            if (currentTime < arrival) {
                currentTime = arrival;
            }
            currentTime += inspect;
        }
        bw.write(currentTime + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}