import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ca = sc.nextInt();
        int Ba = sc.nextInt();
        int Pa = sc.nextInt();
        int Cr = sc.nextInt();
        int Br = sc.nextInt();
        int Pr = sc.nextInt();
        int sum = 0;
        if (Cr >= Ca) sum += Cr - Ca;
        if (Br >= Ba) sum += Br - Ba;
        if (Pr >= Pa) sum += Pr - Pa;
        System.out.println(sum);
    }
}