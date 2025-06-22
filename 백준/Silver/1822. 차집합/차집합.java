import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int countA = Integer.parseInt(st.nextToken());
        int countB = Integer.parseInt(st.nextToken());
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < countA; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < countB; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }
        List<Integer> result = new ArrayList<>();
        for (int num : setA) {
            if (!setB.contains(num)) {
                result.add(num);
            }
        }
        Collections.sort(result);
        bw.write(result.size() + "\n");
        for (int num : result) {
            bw.write(num + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}