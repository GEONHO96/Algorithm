import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            if (S.equals("Algorithm")) System.out.println("204");
            else if (S.equals("DataAnalysis")) System.out.println("207");
            else if (S.equals("ArtificialIntelligence")) System.out.println("302");
            else if (S.equals("CyberSecurity")) System.out.println("B101");
            else if (S.equals("Network")) System.out.println("303");
            else if (S.equals("Startup")) System.out.println("501");
            else if (S.equals("TestStrategy")) System.out.println("105");
        }
    }
}