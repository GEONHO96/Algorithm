import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        if (x[0] == x[1] && x[1] != x[2]) System.out.print(x[2] + " ");
        else if (x[1] == x[2] && x[2] != x[0]) System.out.print(x[0] + " ");
        else if (x[2] == x[0] && x[0] != x[1]) System.out.print(x[1] + " ");
        if (y[0] == y[1] && y[1] != y[2]) System.out.print(y[2] + " ");
        else if (y[1] == y[2] && y[2] != y[0]) System.out.print(y[0] + " ");
        else if (y[2] == y[0] && y[0] != y[1]) System.out.print(y[1] + " ");
    }
}