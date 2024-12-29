import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        StringBuilder S = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) S.append(":").append(id).append(":");
                else if (j == 2) S.append(":fan:").append("\n");
                else S.append(":fan:");
            }
        }
        System.out.println(S);
    }
}