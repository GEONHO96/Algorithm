import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int cntA = 0;
        int cntB = 0;
        HashSet<String> sA = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            String name = st.nextToken();
            sA.add(name);
        }
        HashSet<String> sB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            String name = st.nextToken();
            sB.add(name);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < G; i++) {
            String name = st.nextToken();
            if (sA.contains(name)) cntA++;
            if (sB.contains(name)) cntB++;
        }
        if (cntA > cntB) bw.write("A");
        else if (cntA == cntB) bw.write("TIE");
        else bw.write("B");
        bw.flush();
        bw.close();
        br.close();
    }
}