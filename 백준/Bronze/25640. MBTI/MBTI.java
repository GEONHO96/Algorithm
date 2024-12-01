import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            String T = sc.next();
            if (S.equals(T)) cnt++;
        }
        System.out.println(cnt);
    }
}