import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = S.length();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = S.substring(i);
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}