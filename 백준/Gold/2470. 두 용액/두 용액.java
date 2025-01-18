import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0, right = N - 1;
        int closestSum = Integer.MAX_VALUE;  // 0에 가장 가까운 합
        int answer1 = 0, answer2 = 0;        // 결과 저장

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                answer1 = arr[left];
                answer2 = arr[right];
            }

            if (sum == 0) {
                break;
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(answer1 + " " + answer2);
    }
}