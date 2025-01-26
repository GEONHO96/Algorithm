import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> unheard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unheard.add(br.readLine());
        }
        
        TreeSet<String> unheardAndUnseen = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (unheard.contains(name)) {
                unheardAndUnseen.add(name);
            }
        }
        
        bw.write(unheardAndUnseen.size() + "\n");
        for (String name : unheardAndUnseen) {
            bw.write(name + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}