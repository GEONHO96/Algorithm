import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] points = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points);
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            
            int left = lowerBound(points, L);
            int right = upperBound(points, R);
            
            int count = right - left + 1;
            bw.write(count + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static int lowerBound(int[] points, int target) {
        int left = 0, right = points.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (points[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    private static int upperBound(int[] points, int target) {
        int left = 0, right = points.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (points[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}