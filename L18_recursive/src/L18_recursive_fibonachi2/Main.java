package L18_recursive_fibonachi2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ваше число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(0);
        System.out.println(1);
        int first = 0, second = 1, sum = 0;

        for (int i = 0; i < number-2; i++) {

            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;

        }
    }
}