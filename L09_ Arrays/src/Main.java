import java.util.Arrays;
import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        int[] masyv = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println ( (int) Math.pow(masyv[4],2));
//        System.out.println ( (int) Math.pow(masyv[9],2));
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] masyv = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        masyv[4] *= 2;
//        System.out.println(masyv[4]);
//    }
//}
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int[] masyv = new int[15];
        System.out.println("Введіть 15 значень масиву:");

        for (int x=0; x<masyv.length; x++) {
            String valueFromScanner = scan.nextLine(); // читаємо введення від користувача, в тому числі пустий рядок
            if (valueFromScanner.isBlank()) break; // перевіряємо, чи відправив щось користувач
            masyv[i] = Integer.parseInt(valueFromScanner); // перетворюємо рядок в число
            sum += masyv[i];
        }
        System.out.println(sum);
    }
}