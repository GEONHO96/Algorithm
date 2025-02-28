import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c == 'M') System.out.print("MatKor");
        else if (c == 'W') System.out.print("WiCys");
        else if (c == 'C') System.out.print("CyKor");
        else if (c == 'A') System.out.print("AlKor");
        else System.out.print("$clear");
    }
}