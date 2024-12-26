import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int cnt = 0;
        if (T == A) cnt++;
        if (T == B) cnt++;
        if (T == C) cnt++;
        if (T == D) cnt++;
        if (T == E) cnt++;
        System.out.println(cnt);
    }
}