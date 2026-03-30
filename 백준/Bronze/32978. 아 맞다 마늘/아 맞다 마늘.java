import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] allIngredients = br.readLine().split(" ");
        String[] usedIngredients = br.readLine().split(" ");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N - 1; i++) {
            set.add(usedIngredients[i]);
        }
        for (String key : allIngredients) {
            if (!set.contains(key)) {
                bw.write(key);
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}