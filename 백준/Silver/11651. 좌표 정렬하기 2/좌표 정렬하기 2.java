import java.util.Scanner;
import java.util.Arrays;

class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Coordinate coordinate) {
        if (this.y == coordinate.y)
            return this.x - coordinate.x;
        return this.y - coordinate.y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Coordinate[] coordinate = new Coordinate[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            coordinate[i] = new Coordinate(x, y);
        }
        Arrays.sort(coordinate);
        for (int i = 0; i < N; i++)
            System.out.println(coordinate[i].x + " " + coordinate[i].y);
    }
}