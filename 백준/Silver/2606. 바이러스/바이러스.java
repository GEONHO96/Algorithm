import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static List<List<Integer>> network = new ArrayList<>();
    static boolean[] visited;
    static int infectedCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalComputers = Integer.parseInt(br.readLine());
        int connectedCount = Integer.parseInt(br.readLine());
        for (int i = 0; i <= totalComputers; i++) {
            network.add(new ArrayList<>());
        }
        for (int i = 0; i < connectedCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int computerA = Integer.parseInt(st.nextToken());
            int computerB = Integer.parseInt(st.nextToken());
            network.get(computerA).add(computerB);
            network.get(computerB).add(computerA);
        }
        visited = new boolean[totalComputers + 1];
        dfs(1);
        bw.write(String.valueOf(infectedCount - 1));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
    public static void dfs(int current) {
        visited[current] = true;
        infectedCount++;
        for (int next : network.get(current)) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next);
            }
        }
    }
}