import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int N;
    public static class Jump {
        int index;
        int cnt;
        Jump(int index, int cnt) {
            this.index = index;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] Ai = new int[N];
        for (int i = 0; i < N; i++) {
            Ai[i] = sc.nextInt();
        }
        bfs(Ai);
    }

    public static void bfs(int[] Ai) {
        Queue<Jump> queue = new LinkedList<>();
        boolean[] visited = new boolean[Ai.length];
        queue.add(new Jump(0, 0));
        visited[0] = true;
        while (!queue.isEmpty()) {
            Jump now = queue.poll();
            if (now.index == Ai.length - 1) {
                System.out.println(now.cnt);
                return;
            }
            for (int i = 0; i < Ai[now.index]; i++) {
                if (now.index + Ai[now.index] - i < N &&!visited[now.index + Ai[now.index] - i]) {
                    queue.add(new Jump(now.index + Ai[now.index] - i, now.cnt + 1));
                    visited[now.index + Ai[now.index] - i] = true;
                }
            }
        }
        System.out.println(-1);
    }
}