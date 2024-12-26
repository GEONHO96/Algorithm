import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int max = 0;
        int people = 0;
        for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            people += y[i] - x[i];
            max = Math.max(max, people);
        }
        System.out.println(max);
    }
}