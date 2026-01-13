import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if (str.equals("end")) break;
            else if (str.equals("animal")) System.out.println("Panthera tigris");
            else if (str.equals("flower")) System.out.println("Forsythia koreana");
            else if (str.equals("tree")) System.out.println("Pinus densiflora");
        }
    }
}