import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr3 = new int[8];
        for (int i = 0; i < 8; i++) {
            arr3[i] = sc.nextInt();
        }
        if (Arrays.equals(arr3, arr1)) System.out.println("ascending");
        else if (Arrays.equals(arr3, arr2)) System.out.println("descending");
        else System.out.println("mixed");
    }
}