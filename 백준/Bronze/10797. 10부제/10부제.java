import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int[] arr = new int[5];
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == day) cnt++;
        }
        System.out.println(cnt);
    }
}