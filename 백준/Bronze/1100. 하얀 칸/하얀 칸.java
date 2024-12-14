import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] line = new String[8];
        for (int i = 0; i < 8; i++) {
            line[i] = sc.next();
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0 && line[i].charAt(j) == 'F') count++;
                }
                if (i % 2 == 1) {
                    if (j % 2 == 1 && line[i].charAt(j) == 'F') count++;
                }
            }
        }
        System.out.println(count);
    }
}