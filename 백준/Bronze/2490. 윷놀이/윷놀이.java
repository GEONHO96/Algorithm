import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] yutnori = new int[4];
        for (int i = 0; i < 3; i++) {
            int cnt0 = 0;
            int cnt1 = 0;
            for (int j = 0; j < 4; j++) {
                yutnori[j] = sc.nextInt();
                if (yutnori[j] == 0) cnt0++;
                if (yutnori[j] == 1) cnt1++;
            }
            if (cnt0 == 1 && cnt1 == 3) System.out.println("A");
            if (cnt0 == 2 && cnt1 == 2) System.out.println("B");
            if (cnt0 == 3 && cnt1 == 1) System.out.println("C");
            if (cnt0 == 4 && cnt1 == 0) System.out.println("D");
            if (cnt0 == 0 && cnt1 == 4) System.out.println("E");
        }
    }
}