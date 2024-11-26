import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while(true) {
            int n0 = sc.nextInt();
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            if(n0 == 0) break;
            n1 = 3 * n0;
            if (n1 % 2 == 1) n2 = (n1 + 1) / 2;
            else n2 = (n1 / 2);
            n3 = 3 * n2;
            n4 = n3 / 9;
            if (n1 % 2 == 0) n0 = 2 * n4;
            else n0 = 2 * n4 + 1;
            if (n1 % 2 == 0) {
                System.out.println(cnt + ". even " + n4);
                cnt++;
            }
            else {
                System.out.println(cnt + ". odd " + n4);
                cnt++;
            }
        }
    }
}