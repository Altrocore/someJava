package altrocore.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimumFromFiveNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d) {
        return min(a, b) < min(c, d) ? min(a, b) : min(c, d);
    }

    public static int min(int a, int b, int c, int d, int e) {
        return min(a, b, c, d) < e ? min(a, b, c, d) : e;
    }
}
