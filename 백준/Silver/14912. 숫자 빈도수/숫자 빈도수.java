import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        StringBuilder S = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            S.append(Integer.toString(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (Integer.parseInt(String.valueOf(S.charAt(i))) == d) cnt++;
        }
        System.out.println(cnt);
    }
}