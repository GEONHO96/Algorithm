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
        int C = Integer.parseInt(br.readLine());
        int totalMinutes = A * 60 + B + C;
        if (totalMinutes >= 24 * 60) {
            bw.write((totalMinutes - 24 * 60) / 60 + " " + (totalMinutes -  24 * 60) % 60);
        } else {
            bw.write(totalMinutes / 60 + " " + totalMinutes % 60);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}