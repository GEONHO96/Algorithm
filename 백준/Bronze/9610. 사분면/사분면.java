import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntQ1 = 0;
        int cntQ2 = 0;
        int cntQ3 = 0;
        int cntQ4 = 0;
        int cntAXIS = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > 0 && y > 0) {
                cntQ1++;
            }
            else if (x < 0 && y > 0) {
                cntQ2++;
            }
            else if (x < 0 && y < 0) {
                cntQ3++;
            }
            else if (x > 0 && y < 0) {
                cntQ4++;
            }
            else {
                cntAXIS++;
            }
        }
        System.out.println("Q1: " + cntQ1);
        System.out.println("Q2: " + cntQ2);
        System.out.println("Q3: " + cntQ3);
        System.out.println("Q4: " + cntQ4);
        System.out.println("AXIS: " + cntAXIS);
    }
}