import java.util.Scanner;
import java.util.Arrays;

class Coordinate1 implements Comparable<Coordinate1> {
    int x;
    int y;
    public Coordinate1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Coordinate1 coordinate) {
        if (this.x == coordinate.x)
            return this.y - coordinate.y;
        return this.x - coordinate.x;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Coordinate1[] coordinate = new Coordinate1[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            coordinate[i] = new Coordinate1(x, y);
        }
        Arrays.sort(coordinate);
        for (int i = 0; i < N; i++)
            System.out.println(coordinate[i].x + " " + coordinate[i].y);
    }
}