import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть double1: ");
        double double1 = scan.nextDouble();

        System.out.println("Введіть double2: ");
        double double2 = scan.nextDouble();

        System.out.println(double1>double2);
        System.out.println(double1<double2);
        System.out.println(double1>=double2);
        System.out.println(double1<=double2);
        System.out.println(double1!=double2);
        System.out.println(double1==double2);
    }
}