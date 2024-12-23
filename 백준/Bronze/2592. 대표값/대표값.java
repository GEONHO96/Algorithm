import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
            arr[num[i] / 10]++;
        }
        int avg = sum / 10;
        System.out.println(avg);
        int max = 0;
        for (int i = 0; i < 100; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < 100; i++) {
            if (arr[i] == max) System.out.println(10 * i);
        }
    }
}