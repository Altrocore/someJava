package altrocore.examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentData {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        System.out.println(format.format(date));
    }
}
