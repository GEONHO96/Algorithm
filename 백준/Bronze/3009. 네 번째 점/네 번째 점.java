import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        int x1 = 0;
        int y1 = 0;
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        if (x[0] == x[1] && x[1] != x[2]) x1 = x[2];
        if (x[1] == x[2] && x[2] != x[0]) x1 = x[0];
        if (x[2] == x[0] && x[0] != x[1]) x1 = x[1];
        if (y[0] == y[1] && y[1] != y[2]) y1 = y[2];
        if (y[1] == y[2] && y[2] != y[0]) y1 = y[0];
        if (y[2] == y[0] && y[0] != y[1]) y1 = y[1];
        System.out.print(x1 + " " + y1);
    }
}