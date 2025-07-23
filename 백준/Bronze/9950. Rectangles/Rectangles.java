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
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            if (l == 0 && w == 0 && a == 0) break;
            if (l == 0 && w != 0 && a != 0) {
                if (w >= a) l = w / a;
                else l = a / w;
            }
            if (l != 0 && w == 0 && a != 0) {
                if (l >= a) w = l / a;
                else w = a / l;
            }
            if (l != 0 && w != 0 && a == 0) {
                a = l * w;
            }
            bw.write(l + " " + w + " " + a + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}