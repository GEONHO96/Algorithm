import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int hp = Integer.parseInt(st.nextToken());
            int mp = Integer.parseInt(st.nextToken());
            int atk = Integer.parseInt(st.nextToken());
            int def = Integer.parseInt(st.nextToken());
            int dhp = Integer.parseInt(st.nextToken());
            int dmp = Integer.parseInt(st.nextToken());
            int datk = Integer.parseInt(st.nextToken());
            int ddef = Integer.parseInt(st.nextToken());
            hp += dhp;
            mp += dmp;
            atk += datk;
            def += ddef;
            if (hp < 1) hp = 1;
            if (mp < 1) mp = 1;
            if (atk < 0) atk = 0;
            int cp = hp + 5 * mp + 2 * atk + 2 * def;
            bw.write(cp + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}