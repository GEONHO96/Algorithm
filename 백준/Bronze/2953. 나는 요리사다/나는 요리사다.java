import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int k = 0;
        int[] score = new int[4];
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
                if (sum > max) {
                    max = sum;
                }
            }
            if (sum == max) {
                k = i + 1;
            }
        }
        System.out.println(k + " " + max);
    }
}