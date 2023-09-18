public class ForLoop {
    public static void main(String[] args) {
//        gagarin();
        double res = pow(2, 3);
        System.out.println(res);
        res = pow(3, 4);
        System.out.println(res);
        res = pow(5, 0);
        System.out.println(res);

    }

    public static void gagarin() {
        for (int counter = 10; counter > 0; counter--) {
            System.out.println(counter);
        }
        System.out.println("GO!");
    }

    public static double pow(double a, int n) {
        double res = 1;

        for (int i = 1; i <= n; i++) {
            res *= a;
        }
        return res;
    }

    public static int sumDigits(int num) {
        //Scope
        int res;
        for (res = 0; num != 0; num /= 10) {
            int digit = num % 10;
            res += digit;
        }
        return res;
    }
}
