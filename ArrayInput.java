package altrocore.examples;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int personCount = 5;
        String[] persons = new String[personCount];
        int[] salary = new int[personCount];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = scanner.next();
        }
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Input salary for " + persons[i] + ":");
            salary[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(persons));
        for (int value : salary) {
            System.out.print(value+" ");
        }
        System.out.println();

    }
}
