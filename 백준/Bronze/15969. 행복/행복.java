import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                max = Math.max(max, arr[j] - arr[i]);
            }
        }
        System.out.println(max);
    }
}