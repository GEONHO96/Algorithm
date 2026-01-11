import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> A = new HashMap<>();
        HashMap<Integer, Integer> B = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int numC = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numA; i++) {
            int num = Integer.parseInt(st.nextToken());
            A.put(num, 1);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numB; i++) {
            int num = Integer.parseInt(st.nextToken());
            B.put(num, 1);
            if (A.containsKey(num)) numC++;
        }
        int result = numA + numB - 2 * numC;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}