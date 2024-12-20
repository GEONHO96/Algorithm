import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] minguk = new int[4];
        int S = 0;
        for (int i = 0; i < 4; i++) {
            minguk[i] = sc.nextInt();
            S += minguk[i];
        }
        int[] manse = new int[4];
        int T = 0;
        for (int i = 0; i < 4; i++) {
            manse[i] = sc.nextInt();
            T += manse[i];
        }
        if (S >= T) System.out.println(S);
        else System.out.println(T);
    }
}