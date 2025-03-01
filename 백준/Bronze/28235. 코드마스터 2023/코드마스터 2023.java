import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signal = sc.next();
        if (signal.equals("SONGDO")) System.out.print("HIGHSCHOOL");
        if (signal.equals("CODE")) System.out.print("MASTER");
        if (signal.equals("2023")) System.out.print("0611");
        if (signal.equals("ALGORITHM")) System.out.print("CONTEST");
    }
}