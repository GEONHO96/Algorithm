import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[9];
        int sum = 0;
        int spyA = 0;
        int spyB = 0;
        for (int i = 0; i < 9; i++) {
            height[i] = sc.nextInt();
            sum += height[i];
        }
        Arrays.sort(height);
        for (int i = 0; i < 8; i++) {
            for(int j = i + 1; j < 9; j++) {
                if (sum - height[i] - height[j] == 100) {
                    spyA = i;
                    spyB = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if(i == spyA || i == spyB) {
                continue;
            }
            System.out.println(height[i]);
        }
    }
}