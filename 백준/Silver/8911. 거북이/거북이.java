import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int T = sc.nextInt();
        while (T-- > 0) {
            String commands = sc.next();
            int x = 0, y = 0;
            int dir = 0;
            int minX = 0, maxX = 0, minY = 0, maxY = 0;
            for (char cmd : commands.toCharArray()) {
                if (cmd == 'F') {
                    x += dx[dir];
                    y += dy[dir];
                } else if (cmd == 'B') {
                    x -= dx[dir];
                    y -= dy[dir];
                } else if (cmd == 'L') {
                    dir = (dir + 3) % 4;
                } else if (cmd == 'R') {
                    dir = (dir + 1) % 4;
                }
                minX = Math.min(x, minX);
                maxX = Math.max(x, maxX);
                minY = Math.min(y, minY);
                maxY = Math.max(y, maxY);
            }
            int area = (maxX - minX) * (maxY - minY);
            System.out.println(area);
        }
        sc.close();
    }
}