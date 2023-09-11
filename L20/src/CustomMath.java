public class CustomMath {
    static int plus (int a, int b) {
        return a+b;
    }
    static double plus (double a, double b) {
        return a+b;
    }
    static int minus (int a, int b) {
        return a-b;
    }
    static double minus (double a, double b) {
        return a-b;
    }
    static int pow (int a, int n) {
        int result=1;
        for (int i = 0; i < n ; i++) {
            result *= a;
        }
        return result;

    }
}