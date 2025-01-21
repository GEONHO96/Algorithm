import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static Queue<Node> queue;
    static boolean[] visited;

    public static class Node {
        int x;
        int cnt;
        Node (int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[100001];
        
        queue = new LinkedList<>();
        visited[N] = true;
        queue.add(new Node(N, 0));

        while (!queue.isEmpty()) {
            Node now = queue.poll();
            if (now.x == K) {
                System.out.println(now.cnt);
                break;
            }
            if (0 <= now.x - 1 && now.x - 1 <= 100000 && !visited[now.x - 1]) {
                visited[now.x - 1] = true;
                queue.add(new Node(now.x - 1, now.cnt + 1));
            }
            if (0 <= now.x + 1 && now.x + 1 <= 100000 && !visited[now.x + 1]) {
                visited[now.x + 1] = true;
                queue.add(new Node(now.x + 1, now.cnt + 1));
            }
            if (0 <= now.x * 2 && now.x * 2 <= 100000 && !visited[now.x * 2]) {
                visited[now.x * 2] = true;
                queue.add(new Node(now.x * 2, now.cnt + 1));
            }
        }
    }
}