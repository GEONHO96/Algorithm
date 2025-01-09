import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }
        int[] sequence1 = new int[8];
        for (int i = 0; i < 8; i++) {
            sequence1[i] = i + 1;
        }
        int[] sequence2 = new int[8];
        for (int i = 0; i < 8; i++) {
            sequence2[i] = 8 - i;
        }
        if (Arrays.equals(array, sequence1)) System.out.println("ascending");
        else if (Arrays.equals(array, sequence2)) System.out.println("descending");
        else System.out.println("mixed");
    }
}