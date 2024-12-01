import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sab = sc.nextInt();
        int Fab = sc.nextInt();
        if (Sab <= Fab) System.out.println("high speed rail");
        else System.out.println("flight");
    }
}