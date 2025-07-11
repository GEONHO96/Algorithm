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
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int w = 0;
        if (x != Math.min(Math.min(x, y), z) && x != Math.max(Math.max(x, y), z)) w = x;
        if (y != Math.min(Math.min(x, y), z) && y != Math.max(Math.max(x, y), z)) w = y;
        if (z != Math.min(Math.min(x, y), z) && z != Math.max(Math.max(x, y), z)) w = z;
        String S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') bw.write(String.valueOf(Math.min(Math.min(x, y), z)) + " ");
            if (S.charAt(i) == 'B') bw.write(String.valueOf(w) + " ");
            if (S.charAt(i) == 'C') bw.write(String.valueOf(Math.max(Math.max(x, y), z)) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}