import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mbti  = sc.next();
        if (mbti.charAt(0) == 'E') System.out.print('I');
        if (mbti.charAt(0) == 'I') System.out.print('E');
        if (mbti.charAt(1) == 'S') System.out.print('N');
        if (mbti.charAt(1) == 'N') System.out.print('S');
        if (mbti.charAt(2) == 'T') System.out.print('F');
        if (mbti.charAt(2) == 'F') System.out.print('T');
        if (mbti.charAt(3) == 'J') System.out.print('P');
        if (mbti.charAt(3) == 'P') System.out.print('J');
    }
}