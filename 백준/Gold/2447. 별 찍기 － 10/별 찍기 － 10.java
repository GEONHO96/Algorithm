import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static String[] drawStars(int N) {
        if (N == 1) {
            return new String[]{"*"};
        }
        String[] stars = drawStars(N / 3);
        String[] result = new String[N];
        for (int i = 0; i < N / 3; i++) {
            result[i] = stars[i].repeat(3);
        }
        for (int i = 0; i < N / 3; i++) {
            result[i + N / 3] = stars[i] + " ".repeat(N / 3) + stars[i];
        }
        for (int i = 0; i < N / 3; i++) {
            result[i + 2 * N / 3] = stars[i].repeat(3);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] result = drawStars(N);
        for (String line : result) {
            System.out.println(line);
        }
    }
}