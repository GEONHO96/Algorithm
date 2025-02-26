import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum;
        int[] scores = new int[]{A, B, C};
        Arrays.sort(scores);
        sum = scores[1] + scores[2];
        System.out.println(sum);
    }
}