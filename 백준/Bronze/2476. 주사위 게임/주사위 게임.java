import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        for (int i = 0; i < N; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
            int sum = 0;
            if (first == second && second == third) {
                sum = 10000 + first * 1000;
            }
            if (first == second && second != third) {
                sum = 1000 + first * 100;
            }
            if (second == third && third != first) {
                sum = 1000 + second * 100;
            }
            if (third == first && first != second) {
                sum = 1000 + third * 100;
            }
            if (first != second && second != third && third != first) {
                if (first > second && second > third) {
                    sum = first * 100;
                }
                if (first > third && third > second) {
                    sum = first * 100;
                }
                if (second > third && third > first) {
                    sum = second * 100;
                }
                if (second > first && first > third) {
                    sum = second * 100;
                }
                if (third > first && first > second) {
                    sum = third * 100;
                }
                if (third > second && second > first) {
                    sum = third * 100;
                }
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}