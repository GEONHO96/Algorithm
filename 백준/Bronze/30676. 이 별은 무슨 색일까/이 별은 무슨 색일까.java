import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wavelength = sc.nextInt();
        if (620 <= wavelength && wavelength <= 780) System.out.println("Red");
        if (590 <= wavelength && wavelength < 620) System.out.println("Orange");
        if (570 <= wavelength && wavelength < 590) System.out.println("Yellow");
        if (495 <= wavelength && wavelength < 570) System.out.println("Green");
        if (450 <= wavelength && wavelength < 495) System.out.println("Blue");
        if (425 <= wavelength && wavelength < 450) System.out.println("Indigo");
        if (380 <= wavelength && wavelength < 425) System.out.println("Violet");
    }
}