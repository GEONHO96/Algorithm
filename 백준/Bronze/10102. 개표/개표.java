import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        String result = sc.next();
        int length = result.length();
        int cntA = 0;
        int cntB = 0;
        for (int i = 0; i < length; i++) {
            if (result.charAt(i) == 'A') cntA++;
            if (result.charAt(i) == 'B') cntB++;
        }
        if (cntA > cntB) System.out.println("A");
        else if (cntA == cntB) System.out.println("Tie");
        else System.out.println("B");
    }
}