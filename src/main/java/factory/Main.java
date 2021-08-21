package factory;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double n = 1240.35;
        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        String val = nf.format(n);

        System.out.println(val);

        nf=NumberFormat.getInstance(new Locale("fa", "IR"));
        val = nf.format(n);

        System.out.println(val);

//=========================================================================================================================

        Calendar calendar = Calendar.getInstance();

        int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in a week: " + max);

        max = calendar.getMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Maximum number of days in a month: " + max);


    }
}
