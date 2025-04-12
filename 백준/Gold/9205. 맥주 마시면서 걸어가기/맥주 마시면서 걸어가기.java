import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static Point[] locations;
    static boolean[] visited;
    static int t, n;
    static boolean bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (cur == n + 1) return true;
            for (int i = 0; i < n + 2; i++) {
                if (!visited[i] && distance(locations[cur], locations[i]) <= 1000) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return false;
    }
    static int distance(Point a, Point b) {
        return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            locations = new Point[n + 2];
            visited = new boolean[n + 2];
            for (int i = 0; i < n + 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                locations[i] = new Point(x, y);
            }
            bw.write(bfs() ? "happy\n" : "sad\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}