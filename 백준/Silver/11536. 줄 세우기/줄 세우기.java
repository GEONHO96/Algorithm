import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr1 = new String[N];
        String[] arr2 = new String[N];
        String[] arr3 = new String[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.next();
        }
        for (int i = 0; i < N; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < N; i++) {
            arr3[i] = arr1[i];
        }
        Arrays.sort(arr2, Collections.reverseOrder());
        Arrays.sort(arr3);
        if (Arrays.equals(arr2, arr1)) System.out.println("DECREASING");
        else if (Arrays.equals(arr3, arr1)) System.out.println("INCREASING");
        else System.out.println("NEITHER");
    }
}