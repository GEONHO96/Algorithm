import java.util.Scanner;

public class Main {
    private static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = 0;
        for (int i = Math.max(1, N - String.valueOf(N).length() * 9); i < N; i++) {
            int decompositionSum = i + digitSum(i);
            if (decompositionSum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}