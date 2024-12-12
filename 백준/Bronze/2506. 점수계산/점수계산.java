import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int totalScore = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (arr[i] == 0) score[i] = 0;
                else if (arr[i] == 1) score[i] = 1;
            } else {
                if (arr[i - 1] == 0 && arr[i] == 1) score[i] = 1;
                else if (arr[i - 1] == 1 && arr[i] == 0) score[i] = 0;
                else if (arr[i - 1] == 1 && arr[i] == 1) score[i] = score[i - 1] + 1;
            }
        }
        for (int i = 0; i < N; i++) {
            totalScore += score[i];
        }
        System.out.println(totalScore);
    }
}