import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        BigInteger k = n.divide(m);
        BigInteger l = n.mod(m);
        System.out.println(k);
        System.out.println(l);
    }
}