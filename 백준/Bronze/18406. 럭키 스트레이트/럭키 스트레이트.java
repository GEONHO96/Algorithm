import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = String.valueOf(N);
        int len = S.length();
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < len / 2; i++) {
            leftSum += Integer.parseInt(String.valueOf(S.charAt(i)));
        }
        for (int i = len / 2; i < len; i++) {
            rightSum += Integer.parseInt(String.valueOf(S.charAt(i)));
        }
        if (leftSum == rightSum) System.out.print("LUCKY");
        else System.out.print("READY");
    }
}