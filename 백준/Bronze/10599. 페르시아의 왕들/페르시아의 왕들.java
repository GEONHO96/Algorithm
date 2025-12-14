import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] year = new int[4];
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                year[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(year);
            if (year[0] == 0 && year[1] == 0 && year[2] == 0 && year[3] == 0) {
                break;
            } else {
                bw.write(String.valueOf(year[2] - year[1]) + " ");
                bw.write(String.valueOf(year[3] - year[0]) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}