import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < S.length() - 2; i++) {
            if (S.substring(i, i + 3).equals("JOI")) {
                cnt1++;
            }
        }

        for (int i = 0; i < S.length() - 2; i++) {
            if (S.substring(i, i + 3).equals("IOI")) {
                cnt2++;
            }
        }

        System.out.println(cnt1);
        System.out.println(cnt2);
    }
}