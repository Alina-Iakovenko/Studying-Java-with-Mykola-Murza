import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        for (int x=0; x<arr.length; x++) {
            arr[x]= x;
            System.out.println(arr[x]);
        }

    }


//    public class Main {
//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            while (true) {
//                System.out.print("Введіть значення: ");
//                String line = scan.nextLine();
//                if (line.equalsIgnoreCase("stop")) break;
//            }
//        }
//
}