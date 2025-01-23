import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        int[] group1 = new int[]{A, B, C, D};
        Arrays.sort(group1);

        int sum = group1[1] + group1[2] + group1[3] + Math.max(E, F);
        System.out.println(sum);
    }
}