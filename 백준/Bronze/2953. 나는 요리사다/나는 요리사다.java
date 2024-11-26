import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[6];
        int max = 0;
        for (int i = 1; i <= 5; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            sum[i] = num1 + num2 + num3 + num4;
        }
        for (int i = 1; i <= 5; i++) {
            max = Math.max(max, sum[i]);
        }
        for (int i = 1; i <= 5; i++) {
            if (max == sum[i]) {
                System.out.print(i + " " + sum[i]);
            }
        }
    }
}