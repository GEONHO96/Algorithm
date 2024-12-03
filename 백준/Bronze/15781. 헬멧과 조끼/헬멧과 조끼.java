import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int maxHelmet = 0;
        int maxVest = 0;
        int[] helmet = new int[N];
        for (int i = 0; i < N; i++) {
            helmet[i] = sc.nextInt();
            maxHelmet = Math.max(helmet[i], maxHelmet);
        }
        int[] vest = new int[M];
        for (int i = 0; i < M; i++) {
            vest[i] = sc.nextInt();
            maxVest = Math.max(vest[i], maxVest);
        }
        int savePoint = maxHelmet + maxVest;
        System.out.println(savePoint);
    }
}