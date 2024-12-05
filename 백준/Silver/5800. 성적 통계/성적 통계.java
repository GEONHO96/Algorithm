import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        for (int i = 1; i <= K; i++) {
            int N = sc.nextInt();
            int[] student = new int[N + 1];
            int max = 0;
            for (int j = 1; j <= N; j++) {
                student[j] = sc.nextInt();
            }
            Arrays.sort(student);
            for (int j = 1; j <= N - 1; j++) {
                max = Math.max(max, student[j + 1] - student[j]);
            }
            System.out.println("Class " + i);
            System.out.println("Max " + student[N] + ", Min " + student[1] + ", Largest gap " + max);
        }
    }
}