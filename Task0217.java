package altrocore.examples;

public class Task0217 {
    public static int min(int a, int b, int c, int d) {
        int minNumber;
        if (min(a, b) <= min(c, d)) {
            minNumber = min(a, b);
        } else {
            minNumber = min(c, d);
        }

        return minNumber;
    }

    public static int min(int a, int b) {
        int minNumber;
        if (a <= b) {
            minNumber = a;
        } else {
            minNumber = b;
        }

        return minNumber;
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
