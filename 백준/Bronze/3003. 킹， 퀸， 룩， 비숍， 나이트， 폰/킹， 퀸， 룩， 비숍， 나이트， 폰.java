import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[6];
        for (int i = 0; i < 6; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            System.out.print(arr2[i] - arr1[i] + " ");
        }
    }
}