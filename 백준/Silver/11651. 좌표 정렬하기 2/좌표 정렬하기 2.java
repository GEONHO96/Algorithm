import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Coordinate coordinate) {
        if (this.y == coordinate.y) {
            return this.x - coordinate.x;
        }
        return this.y - coordinate.y;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Coordinate[] coordinate = new Coordinate[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            coordinate[i] = new Coordinate(x, y);
        }
        Arrays.sort(coordinate);
        for (int i = 0; i < N; i++) {
            bw.write(coordinate[i].x + " " + coordinate[i].y + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}