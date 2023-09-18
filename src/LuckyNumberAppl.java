public class LuckyNumberAppl {
    public static void main(String[] args) {
        int res = countDigits(547896220);
        System.out.println(res);
        res = countDigits(0);
        System.out.println(res);
        int num = 457892;
        luckyNumber(num);
        num = 1738649;
        luckyNumber(num);
        num = 457892;
        luckyNumber1(num);
        num = 1738649;
        luckyNumber1(num);


    }

    public static int sumDigits(int num) {
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            res = res + digit;
        }
        return res;
    }

    public static int countDigits(int num) {
        int res = 0;
        do {
            num = num / 10;
            res++;
        } while (num != 0);
        return res;
    }

    public static void luckyNumber(int num) {
        int res1 = 0;
        int res2 = 0;
        int pos = 1;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            if (pos % 2 == 0) {
                res1 += digit;// res1 = res1 + digit;
            } else {
                res2 += digit;// res2 = res2 + digit;
            }
            pos++;
        }
        if (res1 == res2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Unlucky");
        }
    }

    public static void luckyNumber1(int num) {
        int res1 = 0;
        int res2 = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            res1 += digit; // res1 = res1 + digit;
            digit = num % 10;
            num = num / 10;
            res2 += digit; // res2 = res2 + digit;
        }
        if (res1 == res2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Unlucky");
        }
    }

    public static void luckyNumber2(int num) {
        int res = 0;
        while (num != 0) {
            res = num % 10 - res;
            num = num / 10;
        }

        if (res == 0) {
            System.out.println("Lucky");
        } else {
            System.out.println("Unlucky");
        }
    }


}
