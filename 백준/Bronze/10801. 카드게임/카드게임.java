import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        int draw = 0;
        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[10];
        for (int i = 0; i < 10; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) countA++;
            else if (A[i] == B[i]) draw++;
            else countB++;
        }
        if (countA > countB) System.out.println("A");
        else if (countA == countB) System.out.println("D");
        else System.out.println("B");
    }
}