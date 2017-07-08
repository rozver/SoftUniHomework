
import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.SimpleDateFormat;
import  java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class AfterBirth100Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dateStr = sc.nextLine();

        Date today = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        try {
            Date date = formattedDate.parse(dateStr);
            c.setTime(date);
            c.add(Calendar.DATE, 999);  // number of days to add
            String tomorrow = (String)(formattedDate.format(c.getTime()));
            System.out.println(tomorrow);
        }catch(Exception e) {

        }





    }

}
