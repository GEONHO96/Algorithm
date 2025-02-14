import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HH = sc.nextInt();
        int MM = sc.nextInt();
        System.out.print((HH - 9) * 60 + MM);
    }
}