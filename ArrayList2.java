package altrocore.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int x = Integer.parseInt(s);
            if (x % 2 == 0)
                list.add(x);
            else
                list.add(0,x);
        }
    }
}
