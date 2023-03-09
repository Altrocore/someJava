package altrocore.examples;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Your line is " + s);
        int i = scanner.nextInt();
    }
}
