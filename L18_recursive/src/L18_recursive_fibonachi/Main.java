package L18_recursive_fibonachi;

import java.util.Scanner;

public class Main {
    static int first = 1, second = 1, sum = 0, quantity = 0;

    public static void main(String[] args) {
        System.out.println("Ваше число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(0);
        System.out.println(1);

        fibonachi (number);

    }
    public static int fibonachi (int n) {
        if (quantity==n-2) return n;
        quantity ++;

        sum = first+second;
        System.out.println(sum);
        first=second;
        second=sum;

        return fibonachi(n);
    }

}