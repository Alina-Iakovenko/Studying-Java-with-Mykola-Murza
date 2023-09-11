package L18_recursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ваше число: ");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int sum = recursive (s);
        System.out.println (sum);
    }
    public static int recursive(int n) {
        if (n==0) return 0;
        return n+recursive(n-1);
    }

}