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
        int D = Integer.parseInt(br.readLine());
        int totalTime = 3600 * A + 60 * B + C + D;
        if (totalTime >= 86400) {
            totalTime = totalTime % 86400;
            bw.write(totalTime / 3600 + " " + (totalTime % 3600 / 60) + " " + (totalTime % 3600 % 60) + "\n");
        } else {
            bw.write(totalTime / 3600 + " " + (totalTime % 3600 / 60) + " " + (totalTime % 3600 % 60) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}