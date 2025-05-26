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
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            String line = br.readLine();
            for (int j = 0; j < w; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        int area = 0;
        for (int i = 0; i < h; i++) {
            boolean inside = false;
            for (int j = 0; j < w; j++) {
                char ch = map[i][j];
                if (ch == '/' || ch == '\\') {
                    inside = !inside;
                    area++;
                } else if (inside) {
                    area += 2;
                }
            }
        }
        bw.write(String.valueOf(area / 2));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}