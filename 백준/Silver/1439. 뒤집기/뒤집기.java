import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        int count0 = 0;
        int count1 = 0;
        if (S.charAt(0) == '0') count0++;
        else count1++;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i - 1) != S.charAt(i)) {
                if (S.charAt(i) == '0') count0++;
                else count1++;
            }
        }
        System.out.println(Math.min(count0, count1));
    }
}