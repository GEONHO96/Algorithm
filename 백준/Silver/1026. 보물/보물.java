import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        Integer[] BReverse = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(BReverse, Collections.reverseOrder());
        int[] S = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            S[i] = A[i] * BReverse[i];
            sum += S[i];
        }
        System.out.println(sum);
    }
}