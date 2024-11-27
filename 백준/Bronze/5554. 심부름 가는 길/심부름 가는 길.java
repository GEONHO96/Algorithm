import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second1 = sc.nextInt();
        int second2 = sc.nextInt();
        int second3 = sc.nextInt();
        int second4 = sc.nextInt();
        int totalSecond = second1 + second2 + second3 + second4;
        int x = totalSecond / 60;
        int y = totalSecond % 60;
        System.out.println(x);
        System.out.println(y);
    }
}