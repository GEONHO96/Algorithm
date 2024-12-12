import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int partialSum1 = 0;
        int min = 101;
        int partialSum2 = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        min = Math.min(A, min);
        min = Math.min(B, min);
        min = Math.min(C, min);
        min = Math.min(D, min);
        partialSum1 = A + B + C + D - min;
        int E = sc.nextInt();
        int F = sc.nextInt();
        partialSum2 = Math.max(partialSum2, E);
        partialSum2 = Math.max(partialSum2, F);
        int totalScore = partialSum1 + partialSum2;
        System.out.println(totalScore);
    }
}