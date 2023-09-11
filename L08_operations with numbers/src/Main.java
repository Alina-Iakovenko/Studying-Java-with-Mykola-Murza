import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число a: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Введіть операцію (+,-,*,/)");
        String operation = scan.nextLine();
        System.out.println("Введіть число b: ");
        int b = scan.nextInt();

        switch (operation) {
            case "+": {
                System.out.println(a+b);
                break;
            }
            case "-": {
                System.out.println(a-b);
                break;
            }
            case "*": {
                System.out.println(a*b);
                break;
            }
            case "/": {
                if (b!=0) {
                    System.out.println((double)a/b);
                    break;
                }
                else {
                    System.out.println("на 0 ділити не можна");
                    break;
                }
            }
            default:
                System.out.println("Перевірте введені дані");
        }
    }
}