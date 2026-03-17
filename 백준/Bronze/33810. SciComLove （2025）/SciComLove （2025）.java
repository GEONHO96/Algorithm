import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int length = S.length();
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) != "SciComLove".charAt(i)) cnt++;
        }
        System.out.print(cnt);
    }
}