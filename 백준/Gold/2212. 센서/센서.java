import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static int minSensorRange(int N, int K, int[] sensors) {
        Arrays.sort(sensors);
        
        ArrayList<Integer> distances = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            distances.add(sensors[i] - sensors[i - 1]);
        }
        
        Collections.sort(distances);
        
        int result = sensors[N - 1] - sensors[0];
        
        for (int i = 0; i < Math.min(K - 1, N - 1); i++) {
            result -= distances.get(distances.size() - i - 1);
        }
        
        return Math.max(0, result);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] sensors = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(minSensorRange(N, K, sensors));
    }
}