import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = Integer.toString(N);
        int length = S.length();
        char[] ch = new char[length];
        for (int i = 0; i < length; i++) {
            ch[i] = S.charAt(i);
        }
        int[] digit = new int[length];
        for (int i = 0; i < length; i++) {
            digit[i] = Integer.parseInt(String.valueOf(S.charAt(i)));
        }
        Arrays.sort(digit);
        for (int i = 0; i < length; i++) {
            System.out.print(digit[length - i - 1]);
        }
    }
}