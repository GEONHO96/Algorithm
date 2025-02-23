import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int N4 = sc.nextInt();
        int N5 = sc.nextInt();
        int N6 = sc.nextInt();
        int N7 = sc.nextInt();
        int N8 = sc.nextInt();
        if ((N1 == 0 || N1 == 1) && (N2 == 0 || N2 == 1) && (N3 == 0 || N3 == 1) && (N4 == 0 || N4 == 1) && (N5 == 0 || N5 == 1) && (N6 == 0 || N6 == 1) && (N7 == 0 || N7 == 1) && (N8 == 0 || N8 == 1)) System.out.println("S");
        else System.out.println("F");
    }
}